package ProgramacionGenerica;

public class UsoGenericaMia {
    public static <miMac> void main(String[] args) {
        GenericaMia<String> miObj1 = new GenericaMia<String>();

        miObj1.setObjeto("Leonardo");

        GenericaMia<Persona> miPersona = new GenericaMia<Persona>();

        miPersona.setObjeto(new Persona("Maria"));

        System.out.println(miPersona.getObjeto().getNombre());
    }
}

class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}



class Imac {

    public Imac(int pulgadas, double precio) {
        this.pulgadas = pulgadas;
        this.precio = precio;
    }

    public String getImac (){
        return "El Imac que elegiste es de: " + pulgadas + " y tiene un precio de " + precio;
    }

    private int pulgadas;
    private double precio;
}
