package com.AgendaDeContatos.AgendaContatos.repository;

import com.AgendaDeContatos.AgendaContatos.model.ContatosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends JpaRepository<ContatosModel, Long> {
}
