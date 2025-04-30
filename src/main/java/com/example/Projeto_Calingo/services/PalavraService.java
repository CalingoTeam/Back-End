package com.example.Projeto_Calingo.services;

import com.example.Projeto_Calingo.entities.Palavra;

import java.util.List;

public interface PalavraService {
    void addPalavra(Palavra palavra);
    List<Palavra> getPalavras();
    Palavra getPalavra(String id);
    Palavra updatePalavra(String id, Palavra palavra);
    void deletePalavra(String id);
}
