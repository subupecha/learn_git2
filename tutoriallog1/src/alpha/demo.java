package alpha;


import org.apache.logging.log4j.*;

public class demo {
    private static Logger log=LogManager.getLogger(demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("successfully sent keys");
		log.info("page loads successfully");
		log.error("object not found");

	}

}
