package com.fernanda.modulo3semana2.domain.service;

import com.fernanda.modulo3semana2.domain.model.AtendimentosModel;
import com.fernanda.modulo3semana2.domain.model.ClienteModel;
import com.fernanda.modulo3semana2.domain.model.EnderecoModel;
import com.fernanda.modulo3semana2.domain.repository.UsuarioRepository;
import com.fernanda.modulo3semana2.rest.dto.AtendimentosDto;
import com.fernanda.modulo3semana2.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class UsuarioService {

        @Autowired
        UsuarioRepository usuarioRepository;

        public void  salvar(UsuarioDto usuarioDto){
            ClienteModel clienteModel= new ClienteModel();
            clienteModel.setCpf(usuarioDto.getCpf());
            clienteModel.setNome(usuarioDto.getNome());
            String statusDoCliente = statusDoClienteNoSerasa(usuarioDto.getCpf());
            clienteModel.setStatusCliente(statusDoCliente);
            usuarioRepository.salvarCliente(clienteModel);

            EnderecoModel enderecoModel = new EnderecoModel();
            enderecoModel.setCep(usuarioDto.getCpf());
            enderecoModel.setCidade(usuarioDto.getCidade());
            enderecoModel.setEstado(usuarioDto.getEstado());
            enderecoModel.setRua(usuarioDto.getRua());
            usuarioRepository.salvarEndereco(enderecoModel);

            System.out.println("Cliente e endereço salvo com sucesso!");

        }

        public void salvar(AtendimentosDto atendimentosDto){
            AtendimentosModel atendimentosModel = new AtendimentosModel();
            atendimentosModel.setCategoria(atendimentosDto.getCategoria());
            atendimentosModel.setCpf(atendimentosModel.getCpf());
            atendimentosModel.setDescricao(atendimentosModel.getDescricao());
            atendimentosModel.setProfissional(atendimentosModel.getProfissional());
            usuarioRepository.salvarAtendimentos(atendimentosModel);

            System.out.println("Atendimento salvo com sucesso!");
        }

        private  String statusDoClienteNoSerasa(String cpf){
            // requisiçao para a API do Serasa;
            return "Bom";
        }

    public String buscarAtendimentos(String cpf) {
            return "Em construçâo!!!!";
    }
}


