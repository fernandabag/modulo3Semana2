package com.fernanda.modulo3semana2.rest.controller;


import com.fernanda.modulo3semana2.domain.service.UsuarioService;
import com.fernanda.modulo3semana2.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class UsuarioController {

        @Autowired
        UsuarioService usuarioService;

        @PostMapping("/usuario")
        public String salvarUsuario(@RequestBody UsuarioDto usuarioDto) {
            usuarioService.salvar(usuarioDto);
            return "Usuario salvo com sucesso!";
        }
    }

