package br.com.zup.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.reactive.function.client.WebClient;

import br.com.zup.api.model.Veiculo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class VeiculoService {
	
	@Autowired
	private WebClient webClient;
	
	public Mono<Veiculo> obterVeiculo(@PathVariable String codigo) {
		
		Mono<Veiculo> monoVeiculo = this.webClient
		.get()
		.uri("/{codigo}",codigo)
		.retrieve()
		.bodyToMono(Veiculo.class);
				
			
		return monoVeiculo;
	
	/*
	public Flux<Veiculo> obterVeiculo() {
		
		Flux<Veiculo> fluxVeiFlux = this.webClient
		.get()
		.uri("/anos")
		.retrieve()
		.bodyToFlux(Veiculo.class);
				
			
		return fluxVeiFlux;
	}*/
	}
}
