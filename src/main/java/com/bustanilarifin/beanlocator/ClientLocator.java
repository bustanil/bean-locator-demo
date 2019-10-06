package com.bustanilarifin.beanlocator;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ClientLocator implements ApplicationContextAware {


    private ApplicationContext ctx;

    public SentimentClient get(String name) {
        return ctx.getBean(name + "Client", SentimentClient.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }
}
