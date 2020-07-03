
```
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
```

```
var drawImg = function (src, width,ctx) {
    var imgSize = width / 5;
    var imgPos = width / 10 * 4;
    var imgPosFix = width / 120;
    ctx.strokeStyle = '#fff';
    ctx.lineWidth = 1;
    ctx.globalAlpha = 0.8;
    ctx.lineCap = "round";
    ctx.lineJoin = "round";

    ctx.beginPath();
    ctx.moveTo(imgPos - imgPosFix, imgPos - imgPosFix);
    
    ctx.lineTo(imgPos + imgSize + imgPosFix, imgPos - imgPosFix);
    ctx.lineTo(imgPos + imgSize + imgPosFix, imgPos + imgSize + imgPosFix);
    ctx.lineTo(imgPos - imgPosFix, imgPos + imgSize + imgPosFix);
    ctx.lineTo(imgPos - imgPosFix, imgPos - imgPosFix);
    
    ctx.stroke();
    ctx.closePath();

    ctx.drawImage(src, imgPos, imgPos, imgSize, imgSize);
    ctx.beginPath();
  }


  var _canvas = null;

  var api = {

    get ecclevel() {
      return ecclevel;
    },

    set ecclevel(val) {
      ecclevel = val;
    },

    get size() {
      return _size;
    },

    set size(val) {
      _size = val
    },

    get canvas() {
      return _canvas;
    },

    set canvas(el) {
      _canvas = el;
    },

    getFrame: function (string) {
      return genframe(string);
    },
    //这里的utf16to8(str)是对Text中的字符串进行转码，让其支持中文
    utf16to8: function (str) {
      var out, i, len, c;

      out = "";
      len = str.length;
      for (i = 0; i < len; i++) {
        c = str.charCodeAt(i);
        if ((c >= 0x0001) && (c <= 0x007F)) {
          out += str.charAt(i);
        } else if (c > 0x07FF) {
          out += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));
          out += String.fromCharCode(0x80 | ((c >> 6) & 0x3F));
          out += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
        } else {
          out += String.fromCharCode(0xC0 | ((c >> 6) & 0x1F));
          out += String.fromCharCode(0x80 | ((c >> 0) & 0x3F));
        }
      }
      return out;
    },
    draw: function (str, canvas, cavW, cavH, ecc,src) {
      ecclevel = ecc || ecclevel;
      canvas = canvas || _canvas;
      if (!canvas) {
        console.warn('No canvas provided to draw QR code in!')
        return;
      }
      var size = Math.min(cavW, cavH);
      str = this.utf16to8(str);//增加中文显示
      //console.log(str)
      var frame = this.getFrame(str),
        ctx = wx.createCanvasContext(canvas),
        px = Math.round(size / (width + 8));
      var roundedSize = px * (width + 8),
        offset = Math.floor((size - roundedSize) / 2);
      size = roundedSize;
      ctx.clearRect(0, 0, cavW, cavW);
      ctx.setFillStyle('#000000');
      for (var i = 0; i < width; i++) {
        for (var j = 0; j < width; j++) {
          if (frame[j * width + i]) {
            ctx.fillRect(px * (4 + i) + offset, px * (4 + j) + offset, px, px);
          }
        }
      }
      drawImg(src, cavW,ctx);
      ctx.draw();
    }
  }
```
