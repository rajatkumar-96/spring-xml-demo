package com.stackroute;


import domain.Actor;
import domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie= context.getBean("movieA",Movie.class);
        Movie movie1=context.getBean("movieB",Movie.class);

        System.out.println(movie==movie1);



    }
}
