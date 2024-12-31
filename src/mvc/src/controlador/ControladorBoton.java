package mvc.src.controlador;

import mvc.src.modelo.EjecutaConsultas;
import mvc.src.vista.MarcoMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorBoton implements ActionListener {

  private MarcoMVC miJFrame;
  private EjecutaConsultas ejecutaConsultas = new EjecutaConsultas();
  private ResultSet resultadoConsulta;

  public ControladorBoton(MarcoMVC miJFrame) {
    this.miJFrame = miJFrame;
  }


  @Override
  public void actionPerformed(ActionEvent e) {

    String seleccionSecciones = (String) miJFrame.getSecciones().getSelectedItem();
    String seleccionPaises = (String) miJFrame.getPaises().getSelectedItem();

    resultadoConsulta = ejecutaConsultas.consultaBBDD(seleccionSecciones, seleccionPaises);

  try {

      miJFrame.getResultados().setText("");

      while (resultadoConsulta.next()){
        for (int i = 1; i <= 4; i++){
          miJFrame.getResultados().append(resultadoConsulta.getString(i));
          miJFrame.getResultados().append(", ");
        }
        miJFrame.getResultados().append("\n");
      }
  } catch (SQLException ex) {
    throw new RuntimeException(ex);
  }
  }
}
