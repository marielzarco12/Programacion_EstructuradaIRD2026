import javax.swing.*;
/*
Solicita 10 números enteros y muestra el número mayor y el menor.
 */
public class NumerosMayorMenor {
    public static void main (String[] args){
        // Declaracion de variables
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int n = 0;

        // proceso
        while (n < 10) {
                int num = Integer.parseInt(JOptionPane.showInputDialog("Número (" + (n + 1) + "/10):"));
                if (num > mayor) mayor = num;
                if (num < menor) menor = num;
                n++;
        }
       String salida  = JOptionPane.showInputDialog(null, "Mayor: " + mayor + "\nMenor: " + menor);
    }
}
