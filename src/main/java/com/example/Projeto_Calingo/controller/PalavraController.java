package com.example.Projeto_Calingo.controller;

import com.example.Projeto_Calingo.services.PalavraService;
import com.example.Projeto_Calingo.entities.Palavra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/palavra")
public class PalavraController {
    @Autowired
    private PalavraService palavraService;

    @PostMapping("/add")
    public String addPalavra(@RequestBody Palavra palavra) {
        palavraService.addPalavra(palavra);

        return "Palavra adicionada com sucesso";
    }
    @GetMapping
    public List<Palavra> getPalavras() {
        return palavraService.getPalavras();
    }
    @GetMapping("/get")
    public Palavra getPalavra(@RequestParam String id){
        return palavraService.getPalavra(id);
    }
    @PutMapping("/update/{id}")
    public Palavra updatePalavra(@PathVariable String id, @RequestBody Palavra palavra){
        return palavraService.updatePalavra(id, palavra);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePalavra(@PathVariable String id){
        palavraService.deletePalavra(id);

        return ResponseEntity.ok("Palavra deletada com sucesso");
    }
}
