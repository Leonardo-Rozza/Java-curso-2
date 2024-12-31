package mvc.src.vista;

import mvc.src.controlador.*;

import javax.swing.*;
import java.awt.*;

public class MarcoMVC extends JFrame {

  private JComboBox paises;
  private JComboBox secciones;
  private JTextArea resultados;

  public MarcoMVC() {
    setTitle("Consulta Productos");
    setBounds(500, 300, 400, 400);

    setLayout(new BorderLayout());

    JPanel menus = new JPanel();
    menus.setLayout(new FlowLayout());

    secciones = new JComboBox();
    secciones.addItem("Todas");

    paises = new JComboBox();
    paises.addItem("Todos");

    menus.add(secciones);
    menus.add(paises);

    add(menus, BorderLayout.NORTH);

    resultados = new JTextArea(4,40);

    add(resultados, BorderLayout.CENTER);

    JButton consultar = new JButton("Consultar");

    consultar.addActionListener(new ControladorBoton(this));

    add(consultar, BorderLayout.SOUTH);

    addWindowListener(new ControladorCargaMenus(this));

  }

  public JComboBox getPaises() {
    return paises;
  }

  public void setPaises(JComboBox paises) {
    this.paises = paises;
  }

  public JComboBox getSecciones() {
    return secciones;
  }

  public void setSecciones(JComboBox secciones) {
    this.secciones = secciones;
  }

  public JTextArea getResultados() {
    return resultados;
  }

  public void setResultados(JTextArea resultados) {
    this.resultados = resultados;
  }

}
