package alpha;

import org.apache.logging.log4j.*;



public class demo {
	private static Logger log=LogManager.getLogger(demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I m debugging");
		log.info("page is loaded successfully");
		log.error("object is not present");
		log.error("validation failed");

	}

}
