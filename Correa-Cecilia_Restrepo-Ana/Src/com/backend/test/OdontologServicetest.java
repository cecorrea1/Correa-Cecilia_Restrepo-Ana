package com.backend.test;

import com.backend.entity.Odontologo;
import com.backend.repository.impl.OdontologoDaoH2;
import com.backend.repository.impl.OdontologoDaoMemory;
import com.backend.service.impl.odontologoService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    private odontologoService OdontologoService;

    @Test
    void deberiaRetornarseUnaListaNoVaciaDeOdontologosEnH2(){
        OdontologoService = new odontologoService(new OdontologoDaoH2());
        assertFalse(OdontologoService.listarOdontologos().isEmpty());
    }
}
