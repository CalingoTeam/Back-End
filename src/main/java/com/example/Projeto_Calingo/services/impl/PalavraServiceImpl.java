package com.example.Projeto_Calingo.services.impl;


import com.example.Projeto_Calingo.repositories.PalavraRepository;
import com.example.Projeto_Calingo.services.PalavraService;
import com.example.Projeto_Calingo.entities.Palavra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PalavraServiceImpl implements PalavraService {
    @Autowired
    private PalavraRepository palavraRepository;
    @Override
    public void addPalavra(Palavra palavra) {
        palavraRepository.save(palavra);
    }

    @Override
    public List<Palavra> getPalavras() {
        return palavraRepository.findAll();
    }

    @Override
    public Palavra getPalavra(String id) {
        Palavra palavra = palavraRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "id invalido " + id));
        return palavra;
    }

    @Override
    public Palavra updatePalavra(String id, Palavra palavra) {

        Palavra existingPalavra = palavraRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "id invalido " + id));
       palavra.setId(existingPalavra.getId());
       return palavraRepository.save(palavra);
    }

    @Override
    public void deletePalavra(String id) {
        Palavra palavra = palavraRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "id invalido " + id));
        palavraRepository.delete(palavra);
    }
}
