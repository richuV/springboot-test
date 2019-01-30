package com.example.rabbitmq.rabbitmqTest;


import com.example.rabbitmq.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicTest {

    @Autowired
    private TopicSender TopicSender;

    @Test
    public void topic()throws Exception{
        TopicSender.send();
    }
    @Test
    public void topic1() throws Exception {
        TopicSender.send1();
    }

    @Test
    public void topic2() throws Exception {
        TopicSender.send2();
    }

}
