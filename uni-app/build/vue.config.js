const path = require('path')

const resolve = dir => path.resolve(__dirname, '../', dir)

const pkgPath = resolve('package.json')

const webpackConfig = require('./webpack.config.js')

module.exports = {
  publicPath: '/',
  outputDir: resolve('./packages/uni-' + process.env.UNI_PLATFORM + '/dist'),
  lintOnSave: true, // or error
  runtimeCompiler: false,
  transpileDependencies: [],
  productionSourceMap: false,
  configureWebpack: webpackConfig,
  chainWebpack: config => {
    config.devtool('source-map')

    config.module
      .rule('eslint')
      .include
      .add(resolve('src'))
      .add(resolve('lib/' + process.env.UNI_PLATFORM))
      .end()
      .use('eslint-loader')
      .loader(resolve('node_modules/eslint-loader'))
      .options({
        fix: true,
        configFile: pkgPath
      })
    config.plugins.delete('hmr') // remove hot module reload
  },
  css: {
    extract: true
  }
}
