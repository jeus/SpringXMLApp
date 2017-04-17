package com.hamavaran.server.vasat.test;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class Luncher {

    private static final Logger LOGGER = Logger.getLogger(Luncher.class);

  
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context;
        try {
            context = new ClassPathXmlApplicationContext("common-context.xml");
            TestApi api = (TestApi) context.getBean("testApi");
            System.out.println(api.getLastName());
        } catch (BeansException ex) {
            LOGGER.error("Don't load spring", ex);
            System.exit(-1);
            return;
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            LOGGER.error("Interrupt sleep ", ex);
        }
    }
}
