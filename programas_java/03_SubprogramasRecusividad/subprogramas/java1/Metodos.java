package mx.edu.uttt.metodos;

import javax.swing.*;

public class Metodos {
    public static void main (String[] args){
        // declaracion de variables
        int num1 = 0, num2 = 0, sumar = 0;
        saludar();
        num1 = solicitarNumero();
        num2 = solicitarNumero();
        sumar = sumar(num1,num2);
    }
    public static void saludar(){
        JOptionPane.showMessageDialog(null,
                "Bienvenidos a las funciones de java");
    }
    public static int solicitarNumero(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero "));
    }
    public static int sumar (int a, int b){
        return a + b;
    }
}