package com.AgendaDeContatos.AgendaContatos.controller;

import com.AgendaDeContatos.AgendaContatos.model.ContatosModel;
import com.AgendaDeContatos.AgendaContatos.service.ContatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContatosController {

    @Autowired
    ContatosService contatosService;

    @GetMapping(path = "/contatos")
    public List<ContatosModel> mostrarContatos() {
        return contatosService.exibirTodosContatos();
    }

    @GetMapping(path = "/contatos/{codigo}")
    public Optional<ContatosModel> exibirViaId(@PathVariable Long codigo) {
        return contatosService.exibirViaId(codigo);
    }

    @PostMapping(path = "/contatos")
    @ResponseStatus(HttpStatus.CREATED)
    public ContatosModel cadastrarContatos(@RequestBody ContatosModel contatosModel) {
        return contatosService.cadastrarContatos(contatosModel);
    }

    @PutMapping(path = "/contatos/{codigo}")
    public ContatosModel alterarContatos(@RequestBody ContatosModel contatosModel) {
        return contatosService.alterarContatos(contatosModel);
    }

    @DeleteMapping(path = "contatos/{codigo}")
    public void deletarContatos(@PathVariable Long codigo) {
        contatosService.deletarContatos(codigo);
    }

}
