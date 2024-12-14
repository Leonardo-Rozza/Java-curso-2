package ProgramacionGenerica;

public class UsoGenericaMia {
    public static <miMac> void main(String[] args) {
        GenericaMia<String> genericaMia = new GenericaMia<>();

        genericaMia.setObjeto("Leonardo");

        System.out.println(genericaMia.getObjeto());

        GenericaMia<Imac> miMacGenericaMia = new GenericaMia<Imac>();

        Imac miMac = new Imac(27, 2300);

        miMacGenericaMia.setObjeto(miMac);

        System.out.println(miMacGenericaMia.getObjeto());
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
