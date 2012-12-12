package com.dao.Activemq.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Activemq.producer.OrderService;

public class TestJms {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        OrderService orderService = (OrderService) ctx.getBean("orderService");

        for(int i =1; i<=5; i++) {
            orderService.sendOrder(1+i, 10.0D+i);
        }
    }
}
