package com.github.dsfb.LocadoraSpringBoot.controller;

import com.github.dsfb.LocadoraSpringBoot.dto.ClienteDTO;
import com.github.dsfb.LocadoraSpringBoot.dto.MessageResponseDTO;
import com.github.dsfb.LocadoraSpringBoot.exception.ClienteNotFoundException;
import com.github.dsfb.LocadoraSpringBoot.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    private ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid ClienteDTO clienteDTO) {
        return clienteService.create(clienteDTO);
    }

    @GetMapping("/{id}")
    public ClienteDTO findById(@PathVariable Long id) throws ClienteNotFoundException {
        return clienteService.findById(id);
    }
}
