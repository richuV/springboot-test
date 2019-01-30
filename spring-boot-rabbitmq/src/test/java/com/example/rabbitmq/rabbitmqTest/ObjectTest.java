package com.example.rabbitmq.rabbitmqTest;

import com.example.model.User;
import com.example.rabbitmq.object.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ObjectTest {

    @Autowired
    public ObjectSender objectSender;

    @Test
    public void objectTest(){
        User user = new User();
        user.setName("二狗子");
        user.setPassword("123456");
        objectSender.send(user);
    }
}
