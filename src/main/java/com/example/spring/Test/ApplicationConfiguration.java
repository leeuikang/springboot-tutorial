package com.example.spring.Test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application")
public class ApplicationConfiguration {
    private boolean enableSwitchForService1;
    private String service1Url;
    private  int service1Timeout;

    boolean isEnableSwitchForService1(){
        return enableSwitchForService1;
    }
    void setEnableSwitchForService1(boolean enableSwitchForService1){
        this.enableSwitchForService1 = enableSwitchForService1;
    }
    String getService1Url(){
        return service1Url;
    }
    int getService1Timeout(){
        return service1Timeout;
    }
    void setService1Timeout(int service1Timeout){
        this.service1Timeout = service1Timeout;
    }
}
