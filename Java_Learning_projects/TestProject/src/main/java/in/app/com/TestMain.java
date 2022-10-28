package in.app.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {
	public static Logger logger = LoggerFactory.getLogger(TestMain.class);
	public static void main( String[] args )
    {
		logger.debug("Testing Logger");
		logger.debug("Testing Logger....................................");
		logger.info("Hello, world");
        System.out.println( "Hello World!" );
    }
}
