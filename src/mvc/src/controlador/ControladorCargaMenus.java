package mvc.src.controlador;

import mvc.src.vista.*;

import java.awt.event.*;

public class ControladorCargaMenus extends WindowAdapter {

  private MarcoMVC miJFrame;
  private CargaMenus miCargaMenus = new CargaMenus();

  public ControladorCargaMenus(MarcoMVC miJFrame) {
    this.miJFrame = miJFrame;
  }


  public void windowOpened(WindowEvent e) {
    miCargaMenus.ejecutarConsulta();

    try {
      while (miCargaMenus.rsSeccion.next()){
        miJFrame.secciones.addItem(miCargaMenus.rsSeccion.getString(1));
      }

    } catch (Exception error){
      error.printStackTrace();
    }

  }





}
