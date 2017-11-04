chapter20
    SpringBoot项目中使用WebSocker配置广播式通信

    WebSocket为浏览器和服务端提供了双工异步通信的功能，浏览器可以向服务端发送消息，服务端也可以向浏览器发送消息。WebSocket需要浏览器的支持，目前大多数主流的浏览器都是支持的。

    WebSocket是通过socket来实现双工异步通信能力的。但是直接使用WebSocket协议开发程序闲的特别繁琐，一般情况我们使用STOMP来实现交互。

    SpringBoot在tomcat7内嵌版本就已经开始支持了WebSocket的支持，配置源码存在于org.springframework.boot.autoconfigure.websocket下，接下来我们来讲解SpringBoot项目如何配置使用WebSocket。

    本章目标
    SpringBoot项目配置使用WebSocket实现广播式消息。
