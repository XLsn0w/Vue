package com.golong.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author luo
 */
@SpringBootApplication
public class payServerApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(payServerApplication.class, args);
	}

	/*
	 * @Override public void
	 * configureMessageConverters(List<HttpMessageConverter<?>> converters) { //
	 * TODO Auto-generated method stub super.configureMessageConverters(converters);
	 * FastJsonHttpMessageConverter fastConverter = new
	 * FastJsonHttpMessageConverter();
	 * 
	 * FastJsonConfig fastJsonConfig = new FastJsonConfig();
	 * fastJsonConfig.setSerializerFeatures( SerializerFeature.PrettyFormat );
	 * fastConverter.setFastJsonConfig(fastJsonConfig);
	 * 
	 * converters.add(fastConverter); }
	 * 
	 */
	/**
	 * 使用 @Bean 注入 FastJsonHttpMessageConverter
	 * 
	 * @return
	 */
	/*
	 * @Bean public HttpMessageConverters fastJsonHttpMessageConverters() {
	 * //1、需要先定义一个 convert 转换消息对象； FastJsonHttpMessageConverter fastConverter = new
	 * FastJsonHttpMessageConverter();
	 * 
	 * //2、添加 fastJson 的配置信息，比如: 是否要格式化返回的Json数据； FastJsonConfig fastJsonConfig =
	 * new FastJsonConfig();
	 * fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
	 * 
	 * //3、在 Convert 中添加配置信息; fastConverter.setFastJsonConfig(fastJsonConfig);
	 * 
	 * //4、 HttpMessageConverter<?> converter = fastConverter; return new
	 * HttpMessageConverters(converter); }
	 */
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
		// factory.setAddress();
		factory.setPort(8999);
		return factory;

	}
}
