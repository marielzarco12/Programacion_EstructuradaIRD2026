import javax.swing.JOptionPane;
/*
Solicita dos números enteros y muestra todos los números del rango indicando si cada
uno es par o impar.
 */
public class NumImpar {
    public static void main (String[] args){
        // Declaracion de variables
        int num1,num2 ;

        // Pedir los valores

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero entero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo entero"));

        // proceso

        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        String resultado = "Rango de " + inicio + " a " + fin + ":\n";
        for (int i = inicio; i <= fin; i++) {
            String tipo = (i % 2 == 0) ? "Par" : "Impar";
            resultado += i + " es " + tipo + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);



    }
}