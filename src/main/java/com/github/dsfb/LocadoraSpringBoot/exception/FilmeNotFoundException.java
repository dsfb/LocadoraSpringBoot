package com.github.dsfb.LocadoraSpringBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class FilmeNotFoundException extends Exception {
    public FilmeNotFoundException(Long id) {
        super(String.format("Filme nao encontrado com o id: ", id));
    }
}
