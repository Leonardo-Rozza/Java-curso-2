package mvc.src;
import mvc.src.vista.*;

import javax.swing.*;

public class AplicacionMVC {
  public static void main(String[] args) {
    MarcoMVC miApp = new MarcoMVC();

    miApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    miApp.setVisible(true);
  }
}
