package Threads.Ejercicio;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Bancos{
    public static void main(String[] args) {
        Banco macro = new Banco();
        System.out.println(macro.getSaldo());

        Transferencias transferencias = new Transferencias(macro);
        transferencias.start();
        try {
            transferencias.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(macro.getSaldo());
    }
}

public class Banco extends Thread{
    public Banco() {
            cuentaArrayList = new ArrayList<>();
        for (int i = 1; i<= 100; i++){
            nuevaCuenta = new Cuenta();
            cuentaArrayList.add(nuevaCuenta);
            saldoTotal += nuevaCuenta.getSaldo();
        }
    }

    public double getSaldo(){
        return saldoTotal;
    }

   private double saldoTotal;
    Cuenta nuevaCuenta;
    ArrayList<Cuenta>cuentaArrayList;

    public void transferencias(Cuenta cuentaOrigen, Cuenta cuentaDestino, double monto) {
        if (cuentaOrigen == cuentaDestino) {
            System.out.println("No se pueden realizar transferencias a la misma cuenta.");
        }

        if (cuentaOrigen.getSaldo() >= monto){
            cuentaOrigen.enviaTransf(monto, cuentaDestino);
            System.out.println("Transferencia realizada con éxito");
        } else {
            System.out.println("No se puede debitar " + monto + " porque no tiene saldo suficiente: " + getSaldo());
        }
    }
}


class Cuenta{

    public double getSaldo() {
        return saldoInicial;
    }

    public void recibeTrasf(double transf) {
        saldoInicial += transf;
    }

    public void enviaTransf(double transf, Cuenta cuenta) {
            cuenta.recibeTrasf(transf);
            saldoInicial -= transf;

    }
    private double saldoInicial = 2000;
}

class Transferencias extends Thread {


    public Transferencias(Banco banco) {
        this.banco = banco;

        saldoSuficiente = bloqueaBanco.newCondition(); //Generamos una nueva condicion para que el hilo que no pueda realizar la transferencia no se pierda.
    }

    public void run() {
        bloqueaBanco.lock();
        try {
            //Es un while de prueba, para poner el ejemplo nomás.
            while (100 > Math.random()*50) saldoSuficiente.await(); //Ponemos a domir al hilo, hasta que la cuenta tenga el saldo suficiente, para poder realizar la transferencia.
        for (int i = 0; i < 1000; i++) {
            int cuentaOrigenIndex = (int) (Math.random() * banco.cuentaArrayList.size());
            int cuentaDestinoIndex = (int) (Math.random() * banco.cuentaArrayList.size());

            Cuenta cuentaOrigen = banco.cuentaArrayList.get(cuentaOrigenIndex);
            Cuenta cuentaDestino = banco.cuentaArrayList.get(cuentaDestinoIndex);

            double monto = Math.random() * 100;

            banco.transferencias(cuentaOrigen, cuentaDestino, monto);

            saldoSuficiente.signalAll(); //Con este método cada hilo que pase y haga la transferencia, "Despierta" al hilo del await. Para ver si ahora puede realizar la suya. En algun momento va a recibir una transf, Para ver si puede salir de la validacion.
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            bloqueaBanco.unlock();
        }
    }


    private Banco banco;
    private final Lock bloqueaBanco = new ReentrantLock();
    private Condition saldoSuficiente;
}

//Creamos una instancia de tipo LOCK llamando al constructor de ReentrantLock. Para bloquear el hilo mientras..
//se realizan todas las tranferencias. Y asi evitar el problema de los multiples hilos.
