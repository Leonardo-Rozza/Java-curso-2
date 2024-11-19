package ProgramacionGenerica;

import java.util.ArrayList;

public class UsoArrayList {
    public static void main(String[] args) {
        MiArrayList usoArchivos = new MiArrayList(5);

        usoArchivos.agregarElemento("Leonardo");
        usoArchivos.agregarElemento("Ana");
        usoArchivos.agregarElemento("Juan");
        usoArchivos.agregarElemento("Pedro");
        usoArchivos.agregarElemento("Luisina");

        String nombrePersona = (String) usoArchivos.getDatosElementos(2);

        System.out.println(nombrePersona);
    }
}
