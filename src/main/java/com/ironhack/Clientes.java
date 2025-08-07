package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
    private static int counter = 0;
    private int ID;
    private String name;
    private long mp;


//CONSTRUCTORA
    public Clientes(String name, long mp ) {
        this.ID = counter++;
        this.mp = mp;
        this.name = name;
    }

//GETTERS&SETTERS

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMp() {
        return mp;
    }

    public void setMp(long mp) {
        this.mp = mp;
    }






//VISUALIZADOR
    @Override
    public String toString() {
        return "Cliente ID: " + ID + '\n' +
                "Participante :" + name + '\n' +
                "Telf.: " + mp;
    }
}
