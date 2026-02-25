package mx.edu.uttt.metodos;

import javax.swing.*;

public class TestMetodos2 {
    public static void main (String[] args){

        metodos2.saludar();
        metodos2.saludar("pepito");
        int x = metodos2.sumar(10,9);
        JOptionPane.showMessageDialog(null,x);
        JOptionPane.showMessageDialog(null,metodos2.sumar(2,5));

        if(metodos2.autentificar(usuario:"Mariel",pass:"1234567"));
    }
}