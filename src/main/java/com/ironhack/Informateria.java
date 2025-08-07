package com.ironhack;


import java.util.Random;

public class Informateria implements sorteoClientes {

    @Override
    public void inscribirDatos(String name, long num) {
        Clientes cliente = new Clientes(name, num);
        sorteoClientes.clientesTotal.add(cliente);

        System.out.println("💻 " + cliente + " INSCRIT@");

    }

    @Override
    public void comunicarResultado() {
        Random r = new Random();

        int ganador = r.nextInt(10);

        for (Clientes c: sorteoClientes.clientesTotal){
           int rifa = c.getID();

           if (rifa == ganador){
               System.out.println(" 🤩 ENHORABUENA  ➡️" + c.getName() + " has ganado un GAMUSINO");
           }


        }



    }

}
