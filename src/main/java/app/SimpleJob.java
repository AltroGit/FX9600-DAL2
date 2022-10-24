package app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleJob implements Job {
    private final static Logger LOGGER = LogManager.getLogger(SimpleJob.class);

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        LOGGER.info("This is a quartz job!");
    }
}