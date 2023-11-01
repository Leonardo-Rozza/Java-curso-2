package Threads;

public class SincronizacionHilos {
    public static void main(String[] args) {
        SincronizaThreads hilo1 = new SincronizaThreads();
        SincronizaThreads2 hilo2 = new SincronizaThreads2(hilo1);

        //El método Join. Hace que termine un hilo y cuando termine ejecuta el que sigue.
        hilo1.start();

//        try {
//            hilo1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        SincronizaThreads hilo2 = new SincronizaThreads();
//        hilo2.start();
//        try {
//            hilo2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        hilo2.start();
        System.out.println("Hemos terminado la tarea, a ese clg lo va a entrlazar con el hilo 2");
    }
}

class SincronizaThreads extends Thread{
    public void run(){
        for (int i= 0; i<20; i++){
            System.out.println("Ejecutando Thread: " + getName());
            try {
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class SincronizaThreads2 extends Thread{
    public SincronizaThreads2(Thread thread) {
        this.thread = thread;
    }

    public void run(){
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i= 0; i<20; i++){
            System.out.println("Ejecutando Thread: " + getName());
            try {
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    private Thread thread;
}
