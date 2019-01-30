package com.example.rabbitmq.object;


import com.example.model.User;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ObjectReceiver {

    @RabbitListener(queues = "object")
    public void process(User user){
        System.out.println("Receiver object :"+user);
    }
}
