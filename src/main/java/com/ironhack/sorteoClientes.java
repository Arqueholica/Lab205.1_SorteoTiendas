package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public interface sorteoClientes {
    void inscribirDatos(String name, long num);

    void comunicarResultado();

    public static List<Clientes> clientesTotal = new ArrayList<>();


}
