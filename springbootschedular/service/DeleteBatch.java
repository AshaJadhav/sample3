package com.slokam.springbootschedular.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*@Component
public class SayHelloTask {

    private static final Logger LOG = LoggerFactory.getLogger(SayHelloTask.class);

    @Scheduled(fixedRate = 1000)
    public void sayHello(){
        LOG.info("Hello from our simple scheduled method");
    }*/
    
    
    @PropertySource("classpath:/config.properties")
    @EnableScheduling
    @Component
    public class DeleteBatch {

      @Scheduled(cron = "${batch.delete.job.cron}")
      public void doBatchJob() {

      }
    
}
