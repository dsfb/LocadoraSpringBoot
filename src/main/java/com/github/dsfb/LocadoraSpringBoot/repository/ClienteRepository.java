package com.github.dsfb.LocadoraSpringBoot.repository;

import com.github.dsfb.LocadoraSpringBoot.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
