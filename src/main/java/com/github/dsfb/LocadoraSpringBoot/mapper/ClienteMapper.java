package com.github.dsfb.LocadoraSpringBoot.mapper;

import com.github.dsfb.LocadoraSpringBoot.dto.ClienteDTO;
import com.github.dsfb.LocadoraSpringBoot.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteMapper {
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    Cliente toModel(ClienteDTO clienteDTO);

    ClienteDTO toDTO(Cliente cliente);
}
