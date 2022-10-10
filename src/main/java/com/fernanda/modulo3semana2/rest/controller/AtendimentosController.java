package com.fernanda.modulo3semana2.rest.controller;

import com.fernanda.modulo3semana2.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtendimentosController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/atendimentos")
    public String buscarAtendimentos() {
        String atendimentosDtoLocalizadoPeloCpf = usuarioService.buscarAtendimentos("Cpf");
        return atendimentosDtoLocalizadoPeloCpf;
    }
}
