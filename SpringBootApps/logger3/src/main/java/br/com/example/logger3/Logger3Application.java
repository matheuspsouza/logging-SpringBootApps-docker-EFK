package br.com.example.logger3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;

@SpringBootApplication

public class Logger3Application {
	private static final Logger logger = LoggerFactory.getLogger(Logger3Application.class);
	private static final int TIME=3;

	public static void main(String[] args) {
		SpringApplication.run(Logger3Application.class, args);
		generateLog();
	}

	public static void generateLog() {
		long timestamp;
		while (true) {
			timestamp = System.currentTimeMillis() / 1000;
			if (timestamp % TIME == 0) {
				logger.debug("debug");
				logger.info("info");
				logger.warn("warning");
				logger.error("error");
				
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
