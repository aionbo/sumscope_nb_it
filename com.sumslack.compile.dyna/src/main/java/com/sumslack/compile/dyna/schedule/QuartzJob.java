package com.sumslack.compile.dyna.schedule;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class QuartzJob implements Job {

	private String name;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		name = context.getJobDetail().getKey().getName();
		SharedSpace.add2TaskQueue(name) ;
	}

}