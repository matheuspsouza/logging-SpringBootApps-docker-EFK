package br.com.example.logger5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Logger5Application {
	
	private static final Logger logger = LoggerFactory.getLogger(Logger5Application.class);
	private static final int TIME=5;
	
	public static void main(String[] args) {
		SpringApplication.run(Logger5Application.class, args);
		generateLog();
	}


	public static void generateLog() {
		long timestamp;
		while (true) {
			timestamp = System.currentTimeMillis() / 1000;
			if (timestamp % TIME == 0) {
				logger.debug("DEBUG");
				logger.info("INFO");
				logger.warn("WARNING");
				logger.error("ERROR");
				
				try {
					Thread.sleep((long) (Math.random()*1000));
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}

	}

}
