package com.github.dsfb.LocadoraSpringBoot.controller;

import com.github.dsfb.LocadoraSpringBoot.dto.FilmeDTO;
import com.github.dsfb.LocadoraSpringBoot.dto.MessageResponseDTO;
import com.github.dsfb.LocadoraSpringBoot.exception.FilmeNotFoundException;
import com.github.dsfb.LocadoraSpringBoot.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/filmes")
public class FilmeController {

    private FilmeService filmeService;

    @Autowired
    public FilmeController(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid FilmeDTO filmeDTO) {
        return filmeService.create(filmeDTO);
    }

    @GetMapping("/{id}")
    public FilmeDTO findById(Long id) throws FilmeNotFoundException {
        return filmeService.findById(id);
    }
}
