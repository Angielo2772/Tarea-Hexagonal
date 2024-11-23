package com.example.EspinozaAngielo_hexagonal.infraestructure.dao;

import com.example.EspinozaAngielo_hexagonal.infraestructure.entity.EmpresaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaEntity,Long> {
}
