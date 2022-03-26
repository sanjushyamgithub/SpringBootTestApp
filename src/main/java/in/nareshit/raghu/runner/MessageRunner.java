package in.nareshit.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		
		int a=0;
		int b=0;
		System.out.println("HELLO FILE UPDATED!" +(a+b));
		

	}

}
