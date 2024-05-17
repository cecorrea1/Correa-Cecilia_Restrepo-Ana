package com.backend.service.impl;

import com.backend.entity.Odontologo;
import com.backend.repository.IDao;
import com.backend.service.IOdontologoService;

import java.util.List;

public class odontologoService implements IOdontologoService {

    private IDao<Odontologo> odontologoIDao;

    public odontologoService(IDao<Odontologo> OdontologoIDao) {
        this.odontologoIDao = OdontologoIDao;
    }

    @Override
    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoIDao.registrar(odontologo);
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        return odontologoIDao.listarTodos();
    }
}
