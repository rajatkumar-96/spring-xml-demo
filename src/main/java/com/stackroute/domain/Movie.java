package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware {


    public Movie(Actor actor) {
        this.actor = actor;
    }

    Actor actor;
    ApplicationContext context=null;
    Movie ap;



    public void display() {
        System.out.println(actor.name + "  " + actor.gender + " " + actor.age);
    }

    @Override
    public void setBeanName(String beanName) {

    }


    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context=context;
        ap= context.getBean("movie",Movie.class);



    }

}
