package cn.wuti;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by Administrator on 2017/11/4.
 */
@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage message) throws Exception {
        //等待3秒返回消息内容
        Thread.sleep(3000);
        return new WiselyResponse("欢迎使用websocket:" + message.getName());
    }
}
