package jp.co.sisolution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4JExample {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Slf4JExample.class);

		 		
		logger.trace("THIS IS TRACE LOG"); 
		 		
		logger.debug("THIS IS DEBUG LOG"); 
		 		
		logger.info("INFO LOG PARAM1:{}, PARAM2:{}", "HELLO", "WORLD"); 
		 		
		logger.warn("THIS IS WARN"); 
		 		
		logger.error("THIS IS ERROR LOG");
		
		
	}

}
