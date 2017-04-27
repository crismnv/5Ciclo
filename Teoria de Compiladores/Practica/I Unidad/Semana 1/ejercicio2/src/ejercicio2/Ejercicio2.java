package ejercicio2;

import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h, m, s;
        h = Integer.parseInt(JOptionPane.showInputDialog("ingrese las horas"));
        m = Integer.parseInt(JOptionPane.showInputDialog("ingrese los minutos"));
        s = Integer.parseInt(JOptionPane.showInputDialog("ingrese los segundos"));

        int x = s / 60;
        int segundos = s % 60;
        int y = (m + x) / 60;
        int minutos = (m + x) % 60;
        int horas = h + y;

        JOptionPane.showMessageDialog(null, + horas + " horas " + minutos + " minutos " + segundos + " segundos ");

    }
}
