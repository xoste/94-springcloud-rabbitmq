package com.xoste.springbootrabbitmq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息接收者
 * @author Leon
 */
@Component
public class Receiver {

    /**
     * 接收消息的方法。采用消息队列监听机制
     * */
    @RabbitListener(queues = "hello-queue")
    public void receive(String msg) {
        System.out.println("receive:" + msg);
    }
}
