package com.ironhack;

public class Main  {
    public static void main(String[] args) {

        /*
        Podría hacer quizá alguna class abstract que cree un arraylist para ambos ¿?
        O MEJOR un méthod en la interface que cree un arrayList donde entren todos o el arraylist ¿? ¿?

Eres el dueño de dos tiendas de diferente tipo y queremos que los clientes se inscriban para un mismo sorteo.

Tenemos una papelería y una tienda de informática.
Crear un interface sorteoClientes que contenga los métodos inscribirDatos()
(nombre y telefono) y comunicarResultado() para que los clientes puedan apuntarse al sorteo desde ambas tiendas,
y que puedan conocer el resultado en ambos casos ("ha salido ganador el número tal").

+EXTRA: una vez te funcione el interface, crea un sorteo random,
por ejemplo número del 1 al 1000, y comunica ese número en comunicarResultado()

         */

        Papeleria papeleria = new Papeleria();

        Informateria informateria = new Informateria();

        papeleria.inscribirDatos("josefa", 65478451);

        informateria.inscribirDatos("jose", 68475214);

        papeleria.inscribirDatos("antonio", 65478451);

        informateria.inscribirDatos("dolores", 68475214);

        papeleria.inscribirDatos("extenuació", 65478451);

        informateria.inscribirDatos("paco", 68475214);

        papeleria.inscribirDatos("edelmetrio", 65478451);

        informateria.inscribirDatos("hemeroskopeion", 68475214);

        papeleria.inscribirDatos("valak", 65478451);

        informateria.inscribirDatos("vino", 68475214);



        informateria.comunicarResultado();





    }
}