package Threads;

import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
//
//public class UsoThreads {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		JFrame marco=new MarcoRebote();
//
//		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		marco.setVisible(true);
//
//	}
//
//}
//
//
//
//
////Movimiento de la pelota-----------------------------------------------------------------------------------------
//
//class Pelota{
//
//	// Mueve la pelota invirtiendo posici�n si choca con l�mites
//
//	public void mueve_pelota(Rectangle2D limites){
//
//		x+=dx;
//
//		y+=dy;
//
//		if(x<limites.getMinX()){
//
//			x=limites.getMinX();
//
//			dx=-dx;
//		}
//
//		if(x + TAMX>=limites.getMaxX()){
//
//			x=limites.getMaxX() - TAMX;
//
//			dx=-dx;
//		}
//
//		if(y<limites.getMinY()){
//
//			y=limites.getMinY();
//
//			dy=-dy;
//		}
//
//		if(y + TAMY>=limites.getMaxY()){
//
//			y=limites.getMaxY()-TAMY;
//
//			dy=-dy;
//
//		}
//
//	}
//
//	//Forma de la pelota en su posici�n inicial
//
//	public Ellipse2D getShape(){
//
//		return new Ellipse2D.Double(x,y,TAMX,TAMY);
//
//	}
//
//	private static final int TAMX=15;
//
//	private static final int TAMY=15;
//
//	private double x=0;
//
//	private double y=0;
//
//	private double dx=1;
//
//	private double dy=1;
//
//
//}
//
//// L�mina que dibuja las pelotas----------------------------------------------------------------------
//
//
//class LaminaPelota extends JPanel{
//
//	//A�adimos pelota a la l�mina
//
//	public void add(Pelota b){
//
//		pelotas.add(b);
//	}
//
//	public void paintComponent(Graphics g){
//
//		super.paintComponent(g);
//
//		Graphics2D g2=(Graphics2D)g;
//
//		for(Pelota b: pelotas){
//
//			g2.fill(b.getShape());
//		}
//
//	}
//
//	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
//}
//
//
////Marco con l�mina y botones------------------------------------------------------------------------------
//
//
////Paso 1 crear una clase que implemente Runnable
//class PelotaThreads implements Runnable{
//
//	public PelotaThreads (Pelota pelota, Component lamina){
//		this.lamina = lamina;
//		this.pelota = pelota;
//	}
//
//	//Paso 2 escribir el código de nuestra tarea en el método RUN.
//	@Override
//	public void run() {
////		for (int i=1; i<=3000; i++){
////
////			pelota.mueve_pelota(lamina.getBounds());
////
////			lamina.paint(lamina.getGraphics());
////
////			try {
////				Thread.sleep(4);
////			} catch (InterruptedException e) {
////				throw new RuntimeException(e);
////			}
////		}
//
//		//Mientras el hilo actual no este interrumpido-
//		while (!Thread.currentThread().isInterrupted()){
//			pelota.mueve_pelota(lamina.getBounds());
//			lamina.paint(lamina.getGraphics());
//		}
//	}
//
//	private Pelota pelota;
//	private Component lamina;
//}
//
//
//
//class MarcoRebote extends JFrame{
//
//	public MarcoRebote(){
//
//		setBounds(600,300,400,350);
//
//		setTitle ("Rebotes");
//
//		lamina=new LaminaPelota();
//
//		add(lamina, BorderLayout.CENTER);
//
//		JPanel laminaBotones=new JPanel();
//
//		ponerBoton(laminaBotones, "Dale!", new ActionListener(){
//
//			public void actionPerformed(ActionEvent evento){
//
//				comienza_el_juego();
//			}
//
//		});
//
//		ponerBoton(laminaBotones, "Parar", new ActionListener(){
//
//			public void actionPerformed(ActionEvent evento){
//
//				parar();
//			}
//
//		});
//
//
//		ponerBoton(laminaBotones, "Salir", new ActionListener(){
//
//			public void actionPerformed(ActionEvent evento){
//
//				System.exit(0);
//
//			}
//
//		});
//
//		add(laminaBotones, BorderLayout.SOUTH);
//	}
//
//
//	//Ponemos botones
//
//	public void ponerBoton(Container c, String titulo, ActionListener oyente){
//
//		JButton boton=new JButton(titulo);
//
//		c.add(boton);
//
//		boton.addActionListener(oyente);
//
//	}
//
//	//A�ade pelota y la bota 1000 veces
//
//	public void comienza_el_juego (){
//
//
//			Pelota pelota=new Pelota();
//
//			lamina.add(pelota);
//
//			//Paso 3 instanciar la clase creada en una variable de tipo RUNNABLE
//			Runnable r = new PelotaThreads(pelota, lamina);
//
//			//Paso 4 crear una instancia de la clase Threads, pasando como parámetro el obejeto anterior.
//			 t = new Thread(r);
//
//			//Paso 5 y ultimo, poner en marcha el hilo de ejecucion con el método start();
//			t.start();
//
//	}
//
//	public void parar(){
//		t.interrupt();
//	}
//
//	private LaminaPelota lamina;
//	private Thread t;
//	
//}


import java.awt.geom.*;

		import javax.swing.*;

		import java.util.*;
		import java.awt.*;
		import java.awt.event.*;

public class UsoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame marco=new MarcoRebote();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);

	}

}




//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota{

	// Mueve la pelota invirtiendo posici�n si choca con l�mites

	public void mueve_pelota(Rectangle2D limites){

		x+=dx;

		y+=dy;

		if(x<limites.getMinX()){

			x=limites.getMinX();

			dx=-dx;
		}

		if(x + TAMX>=limites.getMaxX()){

			x=limites.getMaxX() - TAMX;

			dx=-dx;
		}

		if(y<limites.getMinY()){

			y=limites.getMinY();

			dy=-dy;
		}

		if(y + TAMY>=limites.getMaxY()){

			y=limites.getMaxY()-TAMY;

			dy=-dy;

		}

	}

	//Forma de la pelota en su posici�n inicial

	public Ellipse2D getShape(){

		return new Ellipse2D.Double(x,y,TAMX,TAMY);

	}

	private static final int TAMX=15;

	private static final int TAMY=15;

	private double x=0;

	private double y=0;

	private double dx=1;

	private double dy=1;


}

// L�mina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel{

	//A�adimos pelota a la l�mina

	public void add(Pelota b){

		pelotas.add(b);
	}

	public void paintComponent(Graphics g){

		super.paintComponent(g);

		Graphics2D g2=(Graphics2D)g;

		for(Pelota b: pelotas){

			g2.fill(b.getShape());
		}

	}

	private ArrayList<Pelota> pelotas=new ArrayList<Pelota>();
}


//Marco con l�mina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame{

	public MarcoRebote(){

		setBounds(600,300,400,350);

		setTitle ("Rebotes");

		lamina=new LaminaPelota();

		add(lamina, BorderLayout.CENTER);

		JPanel laminaBotones=new JPanel();

		ponerBoton(laminaBotones, "Dale!", new ActionListener(){

			public void actionPerformed(ActionEvent evento){

				comienza_el_juego();
			}

		});


		ponerBoton(laminaBotones, "Salir", new ActionListener(){

			public void actionPerformed(ActionEvent evento){

				System.exit(0);

			}

		});

		add(laminaBotones, BorderLayout.SOUTH);
	}


	//Ponemos botones

	public void ponerBoton(Container c, String titulo, ActionListener oyente){

		JButton boton=new JButton(titulo);

		c.add(boton);

		boton.addActionListener(oyente);

	}

	//A�ade pelota y la bota 1000 veces

	public void comienza_el_juego (){


		Pelota pelota=new Pelota();

		lamina.add(pelota);

		for (int i=1; i<=3000; i++){

			pelota.mueve_pelota(lamina.getBounds());

			lamina.paint(lamina.getGraphics());

		}



	}

	private LaminaPelota lamina;


}
