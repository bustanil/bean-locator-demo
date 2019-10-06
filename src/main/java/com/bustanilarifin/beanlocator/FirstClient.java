package com.bustanilarifin.beanlocator;

import org.springframework.stereotype.Service;

@Service
public class FirstClient implements SentimentClient {


    @Override
    public void call() {
        System.out.println("Hello from the first client");
    }
}
