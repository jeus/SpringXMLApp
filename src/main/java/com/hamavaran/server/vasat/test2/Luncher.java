package com.hamavaran.server.vasat.test2;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class Luncher implements Runnable{

    private static final Logger LOGGER = Logger.getLogger(Luncher.class);

    public static void main(String[] args) {
      Thread thread = new Thread(new Luncher());
      thread.run();
    }

    @Override
    public void run() {
         final ClassPathXmlApplicationContext context;
        try {
            context = new ClassPathXmlApplicationContext("common-context.xml","common-context_2.xml");
            TestApi3 api = (TestApi3) context.getBean("testApi");
            System.out.println(api.getLastName() + "   " + api.getAge() + "  " + api.getId());
            Thread.sleep(10000);
            System.out.println("FINISH");
        } catch (BeansException ex) {
            LOGGER.error("Don't load spring", ex);
            System.exit(-1);
            return;
        } catch (InterruptedException ex) {
            LOGGER.error("Don't wait this messages", ex);
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            LOGGER.error("Interrupt sleep ", ex);
        }
    }
}
