package com.backend.test;

import com.backend.entity.Odontologo;
import com.backend.repository.impl.OdontologoDaoH2;
import com.backend.service.impl.odontologoService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {

    private odontologoService OdontologoService;

    @Test
    void deberiaRegistrarseUnOdontologoYObtenerUnaMatriculaEnH2(){

        OdontologoService = new odontologoService(new OdontologoDaoH2());
        Odontologo odontologo = new Odontologo("Nombre","Apellido",0);

        Odontologo OdontologoRegistrado = OdontologoService.registrarOdontologo(odontologo);

        assertNotNull(OdontologoRegistrado.getMatricula());

    }

    @Test
    void deberiaRetornarseUnaListaNoVaciaDeOdontologosEnH2(){
        OdontologoService = new odontologoService(new OdontologoDaoH2());
        assertFalse(OdontologoService.listarOdontologos().isEmpty());
    }

}