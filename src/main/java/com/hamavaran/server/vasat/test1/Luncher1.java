package com.hamavaran.server.vasat.test1;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class Luncher1 implements Runnable {

    private static final Logger LOGGER = Logger.getLogger(Luncher1.class);

    public static void main(String[] args) {
        Thread thread = new Thread(new Luncher1());
        thread.run();
    }

    @Override
    public void run() {
        final ClassPathXmlApplicationContext context;
        try {
            LOGGER.info("BEFORE GEN CONTEXT");
            context = new ClassPathXmlApplicationContext("common-context.xml","common-context-1.xml");
            LOGGER.info("AFTER GEN CONTEXT");
            TestApi1 api = (TestApi1) context.getBean("testApi1");
            LOGGER.info("AFTER GET CONTEXT");
            System.out.println(api.getLastName() + "|||   " + api.getAge() + "  " 
                    + api.getId() + "\n|||  " + api.getApi().getName() + "    " + api.getApi().getLastName() + "    " + api.getApi().getAge());
            LOGGER.info("AFTER SOUT");
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
