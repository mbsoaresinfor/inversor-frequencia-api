package mbs.inversor.frequencia.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

	/**
	 * Pet-Api
	 * @author marcelo soares.
	 * @param args
	 */
	
	public static void main(String[] args) {
		  SpringApplication.run(MainApplication.class, args);
	}
	
	 @Bean
	  CommandLineRunner initDatabase(InversorFrequenciaController inversor) {

	    return args -> {
	      
	      System.out
	      .println("Dados iniciais do inversor: " + inversor.inversorFrequencia.toJson());
	      System.out
	      .println("Dados iniciais do inversor: " + inversor.inversorFrequencia.toString());
	    };
	  }
	
	
}
