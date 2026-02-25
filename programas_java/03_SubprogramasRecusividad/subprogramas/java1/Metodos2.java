package mx.edu.uttt.metodos;

import javax.swing.*;

public class metodos2 {
    public static void saludar (){
        JOptionPane.showMessageDialog(null,"Saludar");

    }
    public static void saludar (String nombre){
        JOptionPane.showMessageDialog(null,"Hola"+ nombre);

    }
    public static int sumar (int a, int b){
        return a + b;
    }
    public static boolean autentificar (String usuario,String password){
        String user = " MARIEL";
        String password = "1234567";

        if(usuario.toUpperCase().equals(user)&& password.toUpperCase().equals(password)){
            return true;

        }
    }
}