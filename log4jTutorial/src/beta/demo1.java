package beta;

import org.apache.logging.log4j.*;



public class demo1 {
	private static Logger log=LogManager.getLogger(demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I m debugging");
		log.info("page is loaded successfully");
		log.error("object is not present");
		log.error("validation failed");

	}

}
