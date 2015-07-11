#MVP架構 & Unit Test sample
MVP架構上大致上就是[參考這篇文章](http://blog.csdn.net/yanbober/article/details/45645115)寫出來的

![MVP模型](http://skyinlayerblog.qiniudn.com/blog/img/2014-5-3-javascript-mvc-mvp.png)

View裡面有宣告一個Presenter，主要是把View的Listener丟出去給Presenter，不直接處理Listen，降低耦合

Presenter裡面有宣告一個Model，Presenter接到View的Listener後會給Model運算、處理邏輯後再塞回去給View

Model裡面全都是運算邏輯能方便做Unit Test

而Unit Test 是[參考這篇教學](https://sites.google.com/a/android.com/tools/tech-docs/unit-testing-support)
照著Setting up Android Studio的步驟就能完成設定
![Unit Test圖片教學](https://raw.githubusercontent.com/lab403/MVP-UnitTest-Sample/master/Screenshot/teach.png)

