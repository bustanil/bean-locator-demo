package com.bustanilarifin.beanlocator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ClientLocatorDemo implements CommandLineRunner {

    @Autowired
    private ClientLocator clientLocator;

    @Override
    public void run(String... args) {
        SentimentClient firstClient = clientLocator.get("first");
        SentimentClient secondClient = clientLocator.get("second");

        firstClient.call();
        secondClient.call();
    }
}
