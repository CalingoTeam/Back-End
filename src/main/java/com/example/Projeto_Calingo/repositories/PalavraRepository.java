package com.example.Projeto_Calingo.repositories;

import com.example.Projeto_Calingo.entities.Palavra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalavraRepository extends JpaRepository<Palavra, String> {

}
