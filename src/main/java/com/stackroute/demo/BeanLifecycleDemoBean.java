package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set : " + message);

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Clean up is done");

    }
    public void customInit(){
        System.out.println("We are here now");
    }
    public void customDestroy(){
        System.out.println("We are out of here now");
    }
}
