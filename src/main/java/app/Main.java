package app;

import app.config.Configuration;
import app.config.ConfigurationReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Main {

    private final static Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        //Loguea mensajes en consola.
        LOGGER.info("Welcome to FX9600 CRUD System");


        //Se crea el scheduler quien va a hacer de orquestador. En él al final se van a registrar todos los Jobs y los triggers encargados de indicar el intervalo de ejecución.
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();

        //Se crea un objeto de tipo Job que básicamente es la tarea que vamos a correr cada cierto intervalo de tiempo.
        //Creas tantos jobs como tareas necesiten ejecutarse.
        //En este caso en la clase SimpleJob solo se va a loguear un mensaje.
        JobDetail job = JobBuilder.newJob(SimpleJob.class)
                .withIdentity("myJob", "group1")
                .build();

        //En este caso se crea un trigger quien es responsable de medir el intercalo de tiempo de cada cuanto timepo se va a lanzar un job.
        //Este trigger fue configurado para que cada 10 segundos ejecute un Job que se va a asociar mas abajo.
        Trigger trigger = TriggerBuilder.newTrigger()
                .withSchedule(
                        SimpleScheduleBuilder.simpleSchedule()
                                .withIntervalInSeconds(10)
                                .repeatForever())
                .build();


        //Aca se asocian los Jobs a ejecutar a un trigger particular. Podes asociar un Job a un tirgger distinto.
        scheduler.scheduleJob(job, trigger);

        //Empiezan a correr todos los jobs.
        scheduler.start();

        //Lee archivo Json de configuraciones y se puede usar el objeto config para obtener cualqueir configuracion que se requiera.
        ConfigurationReader configReader = new ConfigurationReader();
        Configuration config = configReader.readConfigurationFrom("src/main/resources/config.json");

        //Ejemplo de como obtener una configuracion
        String opensApiUri = config.getOpensApiUri();
        LOGGER.info("OpensApiUri: " + opensApiUri);

        //Muestra configuraciones en log
        LOGGER.info(config.toString());
    }
}