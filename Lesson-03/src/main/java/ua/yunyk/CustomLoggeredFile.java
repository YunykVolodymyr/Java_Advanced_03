package ua.yunyk;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLoggeredFile {
	
	private static Logger LOG = Logger.getLogger(CustomLoggeredFile.class);
	
	
	public static void main(String[] args) {
		DOMConfigurator.configure("LoggerConfig.xml");
		LOG.trace("TRACE message");
		LOG.debug("DEBUG message");
		LOG.info("INFO message");
		LOG.warn("WARN message");
		LOG.error("ERROR message");
		LOG.fatal("FATAL message");
	}
}
