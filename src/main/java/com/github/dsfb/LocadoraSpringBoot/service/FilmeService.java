package com.github.dsfb.LocadoraSpringBoot.service;

import com.github.dsfb.LocadoraSpringBoot.dto.FilmeDTO;
import com.github.dsfb.LocadoraSpringBoot.dto.MessageResponseDTO;
import com.github.dsfb.LocadoraSpringBoot.entity.Filme;
import com.github.dsfb.LocadoraSpringBoot.exception.FilmeNotFoundException;
import com.github.dsfb.LocadoraSpringBoot.mapper.FilmeMapper;
import com.github.dsfb.LocadoraSpringBoot.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    private FilmeRepository filmeRepository;

    private final FilmeMapper filmeMapper = FilmeMapper.INSTANCE;

    @Autowired
    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public MessageResponseDTO create(FilmeDTO filmeDTO) {
        Filme filmeASalvar = filmeMapper.toModel(filmeDTO);

        Filme filmeSalvo = filmeRepository.save(filmeASalvar);
        return MessageResponseDTO.builder()
                .message("Filme cadastrado com id: " + filmeSalvo.getId())
                .build();
    }

    public FilmeDTO findById(Long id) throws FilmeNotFoundException {
        Filme filme = filmeRepository.findById(id).orElseThrow(() -> new FilmeNotFoundException(id));

        return filmeMapper.toDTO(filme);
    }
}
