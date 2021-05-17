package br.com.zup.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ZupApiApplication {
	
	@Bean
	public WebClient webClientVeiculos(WebClient.Builder builder) {
		return builder
			.baseUrl("https://parallelum.com.br/fipe/api/v1/carros/marcas/1/modelos/3/anos")
			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZupApiApplication.class, args);
	}

}
