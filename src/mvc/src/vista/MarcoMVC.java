package mvc.src.vista;

import mvc.src.controlador.*;

import javax.swing.*;
import java.awt.*;

public class MarcoMVC extends JFrame {

  private JComboBox paises;
  public JComboBox secciones;
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

    add(consultar, BorderLayout.SOUTH);

    addWindowListener(new ControladorCargaMenus(this));

  }

}
