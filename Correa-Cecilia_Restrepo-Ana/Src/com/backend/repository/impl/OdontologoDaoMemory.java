package com.backend.repository.impl;

import com.backend.entity.Odontologo;
import com.backend.repository.IDao;

import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoMemory implements IDao<Odontologo> {
    private List<Odontologo> odontologos;

    public OdontologoDaoMemory() {
        this.odontologos = new ArrayList<>();
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        odontologos.add(odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        return new ArrayList<>(odontologos);
    }
}