package com.example.EspinozaAngielo_hexagonal.domain.ports.in;

import com.example.EspinozaAngielo_hexagonal.domain.aggregates.dto.EmpresaDto;

public interface EmpresaServiceIn {
    EmpresaDto createEmpresaIn(String ruc);
}
