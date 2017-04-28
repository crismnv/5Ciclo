package bioninformatica1;
import java.util.*;
import javax.swing.JOptionPane;
public class BionInformatica1 {

    public static void main(String[] args) {
      
        String padre, madre, hijo1 = "", hijo2 = "";
        
        
        padre = Integer.toBinaryString(Integer.parseInt(JOptionPane.showInputDialog("Padre")));
        madre = Integer.toBinaryString(Integer.parseInt(JOptionPane.showInputDialog("Madre")));
       
       
        int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa posicion"));
        
 
       while (padre.length() != madre.length())
       {
           
           if (padre.length() < madre.length())
           {
               padre = "0" + padre;
           }else{
               madre = "0" + madre;
           }
       }
       
       /*
        if (padre.length() > madre.length()) 
        {
            for(int i = madre.length(); i< padre.length();i++)
            {
                madre = "0" + madre;
            }
        }else{
            
            for(int i = padre.length(); i< madre.length();i++)
            {
                padre = "0" + padre;
            }
        }*/
              
       //HIJO 1
        System.out.println("PROGENITORES");
       System.out.println("Padre:\t" + padre);
       System.out.println("Madre:\t" + madre);
       int cruces = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de cruces"));
       
        for (int j = 0; j < cruces; j++) 
        {
            
        
            for (int i = 0; i <madre.length() ; i++) 
            {

                if (i < pos) 
                {
                    hijo1 += padre.charAt(i);
                }else{
                    hijo1 += madre.charAt(i);
                }
            }
           //HIJO 2
            for (int i = 0; i <madre.length() ; i++) 
            {

                if (i < pos) 
                {
                    hijo2 += madre.charAt(i);
                }else{
                    hijo2 += padre.charAt(i);
                }
            }
            /*
            for (int i = 0; i < 1000; i++) 
            {
                System.out.println("XX-------XX");
                System.out.println(" XX-----XX");
                System.out.println("  XX---XX");
                System.out.println("   XX-XX");
                System.out.println("    XXXX");
                System.out.println("    XXX");
                System.out.println("   XXXXX");
                System.out.println("  XX---XX");
                System.out.println(" XX-----XX");
                System.out.println("XX-------XX");

            }*/
            System.out.println("CRUCE " +(j+1));
            System.out.println("Hijo 1:\t" + hijo1);
            System.out.println("Hijo 2:\t" + hijo2);
            pos++;
            hijo1 = "";
            hijo2 = "";
            
        }
       
       
        
    }
    
}
