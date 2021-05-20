package br.com.zup.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.client.WebClient;
import br.com.zup.api.model.Veiculo;
import br.com.zup.api.model.VeiculoJson;
import br.com.zup.api.repository.VeiculoRepository;
import reactor.core.publisher.Mono;

@Service
public class VeiculoService {
	
	@Autowired
	private WebClient webClient;
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	public Mono<VeiculoJson> obterVeiculo(@PathVariable String codigo) {
		Mono<VeiculoJson> monoVeiculo = this.webClient
		.get()
		.uri("/{codigo}",codigo)
		.retrieve()
		.bodyToMono(VeiculoJson.class);
		return monoVeiculo;
	
	}

	public void salvar(Veiculo veiculo) {
		
		veiculoRepository.save(veiculo);
	}

}
