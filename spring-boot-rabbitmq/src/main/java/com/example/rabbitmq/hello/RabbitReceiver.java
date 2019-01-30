package com.example.rabbitmq.hello;


import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 简单接收者
 */
@Slf4j
@Component
public class RabbitReceiver {

    @RabbitListener(queues = "hello")
    public void process(String message){
        System.out.println("Receiver"+message);
        log.info("message:"+message);
    }

}
