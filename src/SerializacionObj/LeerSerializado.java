package SerializacionObj;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerSerializado {
    public static void main(String[] args) {
        try {
            ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("C:/Users/Leo/Desktop/JAVA/ObjetoSerializado/Empleados.txt"));

            Empleado[] empleadosRecuperados = (Empleado[]) flujoEntrada.readObject();

            for(Empleado e: empleadosRecuperados){
                System.out.println(e);
            }


            flujoEntrada.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
