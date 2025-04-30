package com.example.Projeto_Calingo.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Table(name = "Palavras")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Palavra {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String meaning;
    private String phrase;
    private String phonology;
    private String state;

}
