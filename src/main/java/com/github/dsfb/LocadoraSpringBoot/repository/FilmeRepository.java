package com.github.dsfb.LocadoraSpringBoot.repository;

import com.github.dsfb.LocadoraSpringBoot.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
}
