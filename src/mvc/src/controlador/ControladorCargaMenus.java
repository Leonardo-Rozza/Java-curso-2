package mvc.src.controlador;

import mvc.src.modelo.CargaMenus;
import mvc.src.vista.*;

import java.awt.event.*;
import java.sql.ResultSet;

public class ControladorCargaMenus extends WindowAdapter {

  private MarcoMVC miJFrame;
  private CargaMenus miCargaMenus = new CargaMenus();
  private ResultSet [] resultadosCombos;

  public ControladorCargaMenus(MarcoMVC miJFrame) {
    this.miJFrame = miJFrame;
  }


  public void windowOpened(WindowEvent e) {
    resultadosCombos = new ResultSet[2];
    resultadosCombos = miCargaMenus.ejecutarConsulta();

    try {
      while (resultadosCombos[0].next()){
        miJFrame.getSecciones().addItem(resultadosCombos[0].getString(1));
      }
      while (resultadosCombos[1].next()){
        miJFrame.getPaises().addItem(resultadosCombos[1].getString(1));
      }

    } catch (Exception error){
      error.printStackTrace();
    }

  }





}
