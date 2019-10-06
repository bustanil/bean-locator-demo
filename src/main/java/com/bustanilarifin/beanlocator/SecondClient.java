package com.bustanilarifin.beanlocator;

import org.springframework.stereotype.Service;

@Service
public class SecondClient implements SentimentClient {

    @Override
    public void call() {
        System.out.println("Hello from the second client");
    }
}
