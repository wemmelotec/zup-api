package br.com.zup.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.zup.api.model.Veiculo;
import br.com.zup.api.model.VeiculoJson;
import br.com.zup.api.service.VeiculoService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("carros")
public class VeiculoController {
	
	
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping("/{codigo}")
	public Mono<VeiculoJson> obterVeiculo(@PathVariable String codigo){
		
		Mono<VeiculoJson> veiculo = this.veiculoService.obterVeiculo(codigo);
		return veiculo;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void salvarVeiculo(@RequestBody Veiculo veiculo) {
		veiculoService.salvar(veiculo);
	}
	
	
}
