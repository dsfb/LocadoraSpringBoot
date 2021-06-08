package com.github.dsfb.LocadoraSpringBoot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilmeDTO {
    private Long id;

    @NotBlank
    @Size(max = 200)
    private String nome;

    @NotNull
    private Double preco;

    private ClienteDTO cliente;

}
