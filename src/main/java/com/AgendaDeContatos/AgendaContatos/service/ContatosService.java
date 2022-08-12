package com.AgendaDeContatos.AgendaContatos.service;

import com.AgendaDeContatos.AgendaContatos.model.ContatosModel;
import com.AgendaDeContatos.AgendaContatos.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosService {

    @Autowired
    private ContatosRepository contatosRepository;


    public List<ContatosModel> exibirTodosContatos() {
        return contatosRepository.findAll();
    }


    public Optional<ContatosModel> exibirViaId(Long codigo) {
        return contatosRepository.findById(codigo);

    }

    public ContatosModel cadastrarContatos(ContatosModel contatosModel) {
        return contatosRepository.save(contatosModel);
    }


    public ContatosModel alterarContatos(ContatosModel contatosModel) {
        return contatosRepository.save(contatosModel);
    }


    public void deletarContatos(Long codigo) {
        contatosRepository.deleteById(codigo);
    }
}
