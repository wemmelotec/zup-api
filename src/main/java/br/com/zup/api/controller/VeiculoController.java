package br.com.zup.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.api.model.Veiculo;
import br.com.zup.api.service.VeiculoService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class VeiculoController {
	
	
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping("/{codigo}")
	public Mono<Veiculo> obterVeiculo(@PathVariable String codigo){
		
		Mono<Veiculo> veiculo = this.veiculoService.obterVeiculo(codigo);
		return veiculo;
	/*
	@GetMapping("/anos")
	public Flux<Veiculo> obterVeiculo(){
		
		Flux<Veiculo> veiculo = this.veiculoService.obterVeiculo();
		return veiculo;
	}*/

}
}
