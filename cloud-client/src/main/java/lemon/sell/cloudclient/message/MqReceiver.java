package lemon.sell.cloudclient.message;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MqReceiver {


    //1. 需要提前创建一个队列 监听某一个queue并且进行消费
    @RabbitListener(queues = "myQueue")
    public void process(String message){
        log.info("receive the message ={}",message);

    }


    //2. 不需要创建 如果没有默认直接创建
    @RabbitListener(queuesToDeclare = @Queue("createQueue") )
    public void processAutoCreateQueue(String message){
        log.info("receive the message from auto create queue ={}",message);

    }

    //3 自动创建队列 数据从队列当中 exchange获取 类似数据聚合
    @RabbitListener(bindings = @QueueBinding(
          value = @Queue("myQueue"), exchange = @Exchange("myExchange")))
    public void processExChange(String message){
        log.info("receive the message from auto create queue exchange ={}",message);

    }
}
