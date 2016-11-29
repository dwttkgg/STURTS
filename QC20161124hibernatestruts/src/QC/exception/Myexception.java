package QC.exception;

import org.apache.log4j.Logger;


public class Myexception extends Exception {
	Logger logger=Logger.getLogger(Myexception.class);
	public Myexception(String message){
		super(message);
		logger.info(message);
		
//		logger.debug(message);
//		logger.info(message);
//		logger.warn(message);
//		logger.error(message);
	}
}
