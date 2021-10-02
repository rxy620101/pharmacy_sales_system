package com.example.demo.support.quart;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QuertJob implements Job {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
      System.out.println ("定时任务，每一分钟执行一次");
    }
}
