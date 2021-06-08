package com.github.dsfb.LocadoraSpringBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClienteNotFoundException extends Exception {
    public ClienteNotFoundException(Long id) {
        super(String.format("Cliente nao encontrado com o id: ", id));
    }
}
