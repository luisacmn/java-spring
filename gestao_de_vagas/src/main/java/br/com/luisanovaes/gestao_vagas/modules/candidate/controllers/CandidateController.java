package br.com.luisanovaes.gestao_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luisanovaes.gestao_vagas.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")               //Definir tipo do método
    public void create(@Valid @RequestBody CandidateEntity candidateEntity) {          //método para criar candidato
        System.out.println("Candidato ");
        System.out.println(candidateEntity.getEmail());
    }
}
