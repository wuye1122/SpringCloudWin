package lemon.sell.cloudclient;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@SpringBootTest
public class MqSenderTest {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send(){

        //需要提前在mq里面定义queue
        amqpTemplate.convertAndSend("myQueue","This test send message;"+new Date());

        //不需要创建队列 自动创建
        amqpTemplate.convertAndSend("createQueue","auto create queue ;"+new Date());
    }

}
