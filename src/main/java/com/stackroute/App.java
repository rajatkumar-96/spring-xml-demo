package com.stackroute;


import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App
{
    public static void main( String[] args ) throws Exception {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        BeanLifecycleDemoBean lc= context.getBean("initialize",BeanLifecycleDemoBean.class);
        System.out.println(lc);
        Movie movie= (Movie)context.getBean("movie",Movie.class);
        movie.display();

        ((ConfigurableApplicationContext)context).close();







    }
}
