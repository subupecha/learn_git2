package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import alpha.demo;

public class demo1 {

	 private static Logger log=LogManager.getLogger(demo1.class.getName());
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			log.debug("successfully sent keys");
			log.info("page loads successfully");
			log.error("object not found");
		}
}
