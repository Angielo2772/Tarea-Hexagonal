package com.example.EspinozaAngielo_hexagonal.domain.impl;

import com.example.EspinozaAngielo_hexagonal.domain.aggregates.dto.EmpresaDto;
import com.example.EspinozaAngielo_hexagonal.domain.ports.in.EmpresaServiceIn;
import com.example.EspinozaAngielo_hexagonal.domain.ports.out.EmpresaServiceOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmpresaServiceImpl implements EmpresaServiceIn {

    private final EmpresaServiceOut empresaServiceOut;

    @Override
    public EmpresaDto createEmpresaIn(String ruc) {
        return empresaServiceOut.createEmpresaOut(ruc);
    }
}
