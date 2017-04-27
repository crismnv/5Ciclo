package ejercicio3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String A[][] = new String[6][5];

        System.out.println("ingrese los nombres ");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; i < 5; j++) {
                String a = teclado.next();
                A[i][j] = a;
                break;
            }
        }
        System.out.println("ingrese las notas");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; i < 5; j++) {

                String a = teclado.next();
                A[i][j] = a;
                break;
            }
        }
  System.out.println("ingrese el peso");
  
    }
}
