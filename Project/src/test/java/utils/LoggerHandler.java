package utils;

/**
 * @Created by Sivasankar M
 * @Description Class for handling logger configurations and logging messages at various levels 
 *              (TRACE, DEBUG, INFO, WARN, ERROR, FATAL) with support for timestamped log files.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class LoggerHandler {

    private static final Logger logger = Logger.getLogger(LoggerHandler.class);

    static {
        setupLoggers();
    }

    /**
     * @Description Configures loggers with a timestamped file and a default file
     *              for logging messages.
     */
    private static void setupLoggers() {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String logFileName = String.format("logs/logfile_%s.log", timestamp);
            // String logFileName1 = "logs/logfile.log";

            PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p %c - %m%n");
            FileAppender timestampedAppender = createFileAppender(logFileName, layout);
            // FileAppender defaultAppender = createFileAppender(logFileName1, layout);

            logger.addAppender(timestampedAppender);
            // logger.addAppender(defaultAppender);

        } catch (Exception e) {
            logger.error("Failed to initialize logger file appender", e);
        }
    }

    /**
     * @Description Creates a file appender with the specified file name and layout.
     * @param fileName The name of the file for logging.
     * @param layout   The pattern layout for formatting log messages.
     * @return A configured FileAppender instance.
     * @throws Exception If an error occurs during appender creation.
     */
    private static FileAppender createFileAppender(String fileName, PatternLayout layout) throws Exception {
        return new FileAppender(layout, fileName, true);
    }

    /**
     * @Description Logs a TRACE-level message.
     * @param message The message to be logged at TRACE level.
     */
    public static void trace(String message) {
        logger.trace(message);
    }

    /**
     * @Description Logs a DEBUG-level message.
     * @param message The message to be logged at DEBUG level.
     */
    public static void debug(String message) {
        logger.debug(message);
    }

    /**
     * @Description Logs an INFO-level message.
     * @param message The message to be logged at INFO level.
     */
    public static void info(String message) {
        logger.info(message);
    }

    /**
     * @Description Logs a WARN-level message.
     * @param message The message to be logged at WARN level.
     */
    public static void warn(String message) {
        logger.warn(message);
    }

    /**
     * @Description Logs an ERROR-level message.
     * @param message The message to be logged at ERROR level.
     */
    public static void error(String message) {
        logger.error(message);
    }

    /**
     * @Description Logs a FATAL-level message.
     * @param message The message to be logged at FATAL level.
     */
    public static void fatal(String message) {
        logger.fatal(message);
    }
}