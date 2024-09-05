package com.ninja.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


// MODEL QUE É O QUE VAI SER SALVO NO BD
@Entity
@Table(name = "ninjas")
@Data // -> Com essa parada do lombk ele cria os getrs e setters sem precisar já sai declarando tudo no código
@AllArgsConstructor // Mesmas coisa do de cima, mas para construtores
@NoArgsConstructor
public class ninjas {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    String nome;
    String aldeia;
    int idade;
    String elemento;
    String imgUrl;
}
