package com.example.spring.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeOtherDataService {
    @Autowired
    private ApplicationConfiguration configuration;

    public String retrieveSomeData(){
        System.out.println(configuration.getService1Timeout());
        System.out.println(configuration.getService1Url());
        System.out.println(configuration.isEnableSwitchForService1());
        return "data from service";
    }
}
