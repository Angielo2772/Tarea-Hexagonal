package com.example.EspinozaAngielo_hexagonal.domain.ports.out;

import com.example.EspinozaAngielo_hexagonal.domain.aggregates.dto.EmpresaDto;

public interface EmpresaServiceOut {
    EmpresaDto createEmpresaOut(String ruc);
}
