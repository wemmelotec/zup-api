package br.com.zup.api.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import br.com.zup.api.model.Usuario;
import br.com.zup.api.service.UsuarioService;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<?> listarUsuarios(){
		return usuarioService.listar();
	}
	
	@PostMapping
	public ResponseEntity<Usuario> salvarUsuario(@Valid @RequestBody Usuario usuario, HttpServletResponse response) {
		return usuarioService.salvar(usuario, response);
	}
	
	@RequestMapping("/{codigo}")
	public ResponseEntity<?> usuario(@PathVariable Long codigo){
		return usuarioService.listarPorId(codigo);
	}
	
}
