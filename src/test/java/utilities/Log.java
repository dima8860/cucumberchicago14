package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {


    private static Logger logger = LogManager.getLogger(Log.class);


    public static void start(String testName) {

        logger.info("<<<<<<<< Scenario : " + testName + " STARTED >>>>>>");
    }
    public static void finish(String testName) {

        logger.info("<<<<<<<< Scenario : " + testName + " FINISHED >>>>>>");
    }
    public static void pass(String testName) {

        logger.info("Scenario " + testName + " PASSED!!!");
    }
    public static void failed(String testName) {

        logger.warn("Scenario " + testName + " FAILED!!!");
    }

    public static void info(String message){
        logger.info(message);
    }

    public static void warn(String message){
        logger.warn(message);
    }

    public static void error(String message){
        logger.error(message);
    }
}
