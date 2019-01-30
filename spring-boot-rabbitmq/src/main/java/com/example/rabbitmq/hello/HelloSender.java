package com.example.rabbitmq.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 简单发送者
 */
@Slf4j
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(){
        String context = "hello"+new Date();
        System.out.println("Sender:"+context);
        this.rabbitTemplate.convertAndSend("hello",context);
    }
}
