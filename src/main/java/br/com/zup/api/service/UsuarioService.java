package br.com.zup.api.service;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.com.zup.api.model.Usuario;
import br.com.zup.api.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public ResponseEntity<?> listar(){
		List<Usuario> usuarios = usuarioRepository.findAll();
		return !usuarios.isEmpty() ? ResponseEntity.ok(usuarios) : ResponseEntity.noContent().build();
	}
		
	public ResponseEntity<Usuario> salvar(Usuario usuario, HttpServletResponse response) {
		Usuario usuarioSalvo = usuarioRepository.save(usuario);
		
		URI uri =  ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}").buildAndExpand(usuario.getCodigo()).toUri();
		 response.setHeader("Location", uri.toASCIIString());
		 
		 return ResponseEntity.created(uri).body(usuarioSalvo);
	}

	public ResponseEntity<?> listarPorId(Long codigo) {
		Usuario usuarioDaBusca = usuarioRepository.findById(codigo).orElse(null);
		if(usuarioDaBusca != null) {
			return ResponseEntity.ok(usuarioDaBusca);
		}else {
			return ResponseEntity.notFound().build();
		}
	}

}
