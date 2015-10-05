package com.AlephAlliance.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Vitalii on 05.10.2015.
 */
public class InitSpringContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        String path = servletContext.getInitParameter("spring-location");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        servletContext.setAttribute("springContext", applicationContext);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
