import javax.swing.*;
/*
Solicita un número entero positivo y calcula su factorial.
 */
public class PositivoFactorial {
    public static void main (String[] args){
        // Declaracion de variables
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo:"));
        if (n < 0) {
            JOptionPane.showMessageDialog(null, "El número debe ser positivo.");
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
        }

    }
}