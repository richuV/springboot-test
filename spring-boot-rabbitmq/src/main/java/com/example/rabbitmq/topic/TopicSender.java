package com.example.rabbitmq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;


    public void send(){
        String context = "Hi,i am message all";
        System.out.println("sender:"+context);
        rabbitTemplate.convertAndSend("topicExchange","topic1",context);
    }


    public void send1() {
        String context = "发送send1会匹配到topic.#和topic.message,两个Receiver都可以收到消息";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.message", context);
    }

    public void send2() {
        String context = "发送send2只有topic.#可以匹配,只有Receiver2监听到消息";
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("topicExchange", "topic.messages", context);
    }

}
