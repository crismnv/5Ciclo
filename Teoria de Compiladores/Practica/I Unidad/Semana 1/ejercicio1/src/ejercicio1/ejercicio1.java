package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        a = Integer.parseInt(JOptionPane.showInputDialog("ingrese la primera variable"));
        b = Integer.parseInt(JOptionPane.showInputDialog("ingrese la segunda variable"));
        c = Integer.parseInt(JOptionPane.showInputDialog("ingrese la tercera variable"));

        double Xi = Math.pow(b, 2) - 4 * a * c;
        if (Xi >= 0) {
            double x1 = (-b + Math.sqrt(Xi)) / 2 * a;
            double x2 = (-b + Math.sqrt(Xi)) / 2 * a;
            JOptionPane.showMessageDialog(null, "la raiz x1 : " + " = " + x1);
            JOptionPane.showMessageDialog(null, "la raiz x2 : " + " = " + x2);

        } else {
            JOptionPane.showMessageDialog(null, "no tiene raizes reales ");

        }

    }
}
