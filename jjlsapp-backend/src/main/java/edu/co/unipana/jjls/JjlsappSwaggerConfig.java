/**
 * 
 */
package edu.co.unipana.jjls;


import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Clase de configuracion Swagger
 * 
 * Clase de configuracion para Swagger
 * 
 * http://localhost:9090/v2/api-docs
 * http://localhost:9090/swagger-ui.html
 * 
 * @author Sergio Arias
 * @date 19/09/2020
 *
 */
@Configuration // Quieron que spring sepa que vamos a crear beans
@EnableSwagger2
public class JjlsappSwaggerConfig {
	
	public static final Contact DEFAULT_CONTACT = new Contact("JJLS APP BACKEND", "",
			"saarias@unipanamericana.edu.c");
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("JJLS Api Documentation", "JJLS Api Documentation",
			"1.0", "PREMIUM", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0",
			new ArrayList<>());
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
	}
}
