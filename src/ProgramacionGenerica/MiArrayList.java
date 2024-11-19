package ProgramacionGenerica;

public class MiArrayList {
    public MiArrayList(int z){
        datosElementos = new Object[z];
    }

    public Object getDatosElementos(int i) {
        return datosElementos[i];
    }

    public void agregarElemento(Object o) {
        datosElementos[i] = o;
        i++;
    }

    private  int i = 0;
    private Object[] datosElementos;
}
