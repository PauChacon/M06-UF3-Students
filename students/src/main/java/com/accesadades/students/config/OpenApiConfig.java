package com.accesadades.students.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.reactive.config.WebFluxConfigurer;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig implements WebFluxConfigurer {

	@Bean
	public OpenAPI customOpenAPI() {
    	return new OpenAPI()
            	.info(new Info()
                    	.title("API REST WebFlux d'Estudiants")
                    	.version("1.0")
                    	.description("Documentació de l'API REST WebFlux d'Estudiants"));
	}
}
