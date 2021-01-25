package com.xoste.springbootrabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息发送者
 * @author Leon
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitmqAmqpTemplate;
    /**
    * 发送消息的方法
    * */
    public void send(String msg) throws InterruptedException {
        // 向消息队列发送消息
        // 参数一：消息队列的名称  参数二：消息内容
        while (true) {
            Thread.sleep(500);
            this.rabbitmqAmqpTemplate.convertAndSend("hello-queue", msg);
        }
    }
}
