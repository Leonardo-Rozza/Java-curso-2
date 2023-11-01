package ProgramacionGenerica;

public class GenericaMia<T> {
    public GenericaMia(){
        objecto = null;
    }
    public void setObjecto (T nuevoValor){
        objecto = nuevoValor;
    }

    public T getObjecto(){
        return objecto;
    }

    private T objecto;
}
