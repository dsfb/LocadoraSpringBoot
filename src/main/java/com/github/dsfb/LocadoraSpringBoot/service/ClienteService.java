package com.github.dsfb.LocadoraSpringBoot.service;

import com.github.dsfb.LocadoraSpringBoot.dto.ClienteDTO;
import com.github.dsfb.LocadoraSpringBoot.dto.MessageResponseDTO;
import com.github.dsfb.LocadoraSpringBoot.entity.Cliente;
import com.github.dsfb.LocadoraSpringBoot.exception.ClienteNotFoundException;
import com.github.dsfb.LocadoraSpringBoot.mapper.ClienteMapper;
import com.github.dsfb.LocadoraSpringBoot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository clienteRepository;

    private ClienteMapper clienteMapper = ClienteMapper.INSTANCE;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public MessageResponseDTO create(ClienteDTO clienteDTO) {
        Cliente clienteASalvar = clienteMapper.toModel(clienteDTO);

        Cliente clienteSalvo = clienteRepository.save(clienteASalvar);
        return MessageResponseDTO.builder()
                .message("Cliente cadastrado com id: " + clienteSalvo.getId())
                .build();
    }

    public ClienteDTO findById(Long id) throws ClienteNotFoundException {
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new ClienteNotFoundException(id));

        return clienteMapper.toDTO(cliente);
    }
}
