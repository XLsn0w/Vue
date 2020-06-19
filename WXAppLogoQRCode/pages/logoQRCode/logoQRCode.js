
var QRCodeJS = require("../../utils/qrcode.js");

Page({
  
  onLoad: function (options) {
    /**
    * 绘制带logo二维码
    * @param url        二维码字符串 如 https://github.com/xlsn0w
    * @param canvas-id  画布ID 如 logoQRCode
    * @param width      二维码宽度 如 275
    * @param height     二维码高度 如 275
    * @param logo       二维码logo 如 /images/xlsn0w.png
    */
    QRCodeJS.qrApi.draw('https://github.com/xlsn0w', "logoQRCode", 275, 275, null, '/images/xlsn0w.png');
  }

})
