package in.nareshit.raghu.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	private static Logger log=LoggerFactory.getLogger(MessageRunner.class);
	@Override
	public void run(String... args) throws Exception {
		
		int a=0;
		int b=0;
		try {
			log.info("Started!");
			System.out.println("HELLO FILE UPDATED!" +(a+b));
		} catch (Exception e) {
			// TODO: handle exception
		}
		log.info("End");
		
		

	}

}
