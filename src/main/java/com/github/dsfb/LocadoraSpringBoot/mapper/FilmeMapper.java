package com.github.dsfb.LocadoraSpringBoot.mapper;

import com.github.dsfb.LocadoraSpringBoot.dto.FilmeDTO;
import com.github.dsfb.LocadoraSpringBoot.entity.Filme;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface FilmeMapper {
    FilmeMapper INSTANCE = Mappers.getMapper(FilmeMapper.class);

    Filme toModel(FilmeDTO filmeDTO);

    FilmeDTO toDTO(Filme filme);
}
