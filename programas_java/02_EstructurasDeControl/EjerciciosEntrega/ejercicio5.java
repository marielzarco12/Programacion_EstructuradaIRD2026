import javax.swing.*;
import java.util.Random;
/*
Permite al usuario 5 intentos para adivinar un número secreto.
 */
public class NumSecreto {
    public static void main (String[] args){
        // Declaracion de variables

        int numsecret = new Random().nextInt(20) + 1; // sirve para realizar numeros alazar
        int intentos = 5;
        boolean gano = false;

        for (int i = 1; i <= intentos; i++) {
                int guess = Integer.parseInt(JOptionPane.showInputDialog("Intento " + i + "/5. ¿Cuál es el número?"));
                if (guess == numsecret) {
                    JOptionPane.showMessageDialog(null, "¡Felicidades! Adivinaste.");
                    gano = true;
                    break;
                } else if (guess < numsecret) {
                    JOptionPane.showMessageDialog(null, "El número es mayor.");
                } else {
                    JOptionPane.showMessageDialog(null, "El número es menor.");
                }
            if (!gano) JOptionPane.showMessageDialog(null, "Perdiste. El número era: " + numsecret);
        }
    }

}