package com.AgendaDeContatos.AgendaContatos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contatos_agenda")
public class ContatosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDoContato;

    @Column(length = 100, nullable = false)
    private String nomeDoContato;

    @Column(length = 100, nullable = false)
    private String ddDoContato;

    @Column(length = 100, nullable = false)
    private String numeroDoContato;

    @Column(length = 100, nullable = false)
    private String estadoDoContato;
}
