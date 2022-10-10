package com.fernanda.modulo3semana2.domain.repository;

import com.fernanda.modulo3semana2.domain.model.AtendimentosModel;
import com.fernanda.modulo3semana2.domain.model.ClienteModel;
import com.fernanda.modulo3semana2.domain.model.EnderecoModel;
import org.springframework.stereotype.Repository;


    @Repository
    public class UsuarioRepository {
        public void salvarCliente(ClienteModel clienteModel){
            var insertTable = " insert into cliente (nome,cpf) values () ";
            System.out.println("cliente inserido com sucesso!"+ clienteModel.toString());
        }

        public void salvarEndereco(EnderecoModel enderecoModel){
            var insertTable = " insert into endereco values () ";
            System.out.println(" Endereço inserido com sucesso!");
        }

        public void salvarAtendimentos(AtendimentosModel atendimentosModel){
            var insertTable = " insert into atendimentos values ()";
            System.out.println(" Atendimento inserido com sucesso!");
        }
    }
