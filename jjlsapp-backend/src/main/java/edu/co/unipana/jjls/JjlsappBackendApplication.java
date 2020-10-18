package edu.co.unipana.jjls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;



/**
 * Clase inicial de spring boot
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
@SpringBootApplication
public class JjlsappBackendApplication  extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JjlsappBackendApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(JjlsappBackendApplication.class);
	}
}
