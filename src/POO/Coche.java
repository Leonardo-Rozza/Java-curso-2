package POO;


public class Coche {
    public Coche(String marca, String modelo, int agno) {
        this.marca = marca;
        this.modelo = modelo;
        this.agno = agno;
    }

    public int getAgno() {
        return agno;
    }

    public void setAgno(int agno) {
        this.agno = agno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    private String marca;
    private String modelo;
    private int agno;



}
