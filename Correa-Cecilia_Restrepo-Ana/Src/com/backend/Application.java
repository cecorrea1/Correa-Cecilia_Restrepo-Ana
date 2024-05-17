package com.backend;

import com.backend.dbconnection.H2Connection;
import com.backend.repository.impl.OdontologoDaoMemory;


public class Application {
    public static void main(String[] args) {

        H2Connection.ejecutarScriptInicial();
    }
}