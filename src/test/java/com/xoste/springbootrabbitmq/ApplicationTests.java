package com.xoste.springbootrabbitmq;

import com.xoste.springbootrabbitmq.sender.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    void contextLoads() {

    }

    @Test
    void SenderTest() throws InterruptedException {
        this.sender.send("消息发送者发送消息");
    }

}
