import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.PatternLayout;

import java.util.logging.Logger;

public class Messages {

    final static Logger logger = Logger.getLogger(String.valueOf(Messages.class));

    public static void main(String[] args) {
        //ConsoleAppender consoleAppender = new ConsoleAppender();
        //consoleAppender.setThreshold(Level.INFO);

        logger.info("Info log message");

        try {
            throw new Exception("Warning!");
        } catch (Exception e) {
            logger.warning(e.getMessage());
        }

    }
}
