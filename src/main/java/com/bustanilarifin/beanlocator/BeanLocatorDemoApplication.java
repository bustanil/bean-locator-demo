package com.bustanilarifin.beanlocator;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class BeanLocatorDemoApplication {

    @Autowired
    ClientLocator clientLocator;

    public static void main(String[] args) {
        SpringApplication.run(BeanLocatorDemoApplication.class, args);
    }

}

