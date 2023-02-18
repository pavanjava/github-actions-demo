package com.sparkdev.rest.api.service.impl;

import com.sparkdev.rest.api.dto.Message;
import com.sparkdev.rest.api.service.HelloWorld;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldImpl implements HelloWorld {
    @Override
    public Message getMessage() {
        return new Message("This is a message from service, Hello World !");
    }
}
