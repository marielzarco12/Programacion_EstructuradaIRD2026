import javax.swing.*;

/*
Solicita calificaciones hasta que el usuario ingrese -1.
 Muestra el promedio, el número
de aprobados y reprobados.
 */
 public class CalificacionesProm {
    public static void main (String[] args){
        // Declaracion de variables
        double suma = 0;
        int contador = 0, aprobados = 0, reprobados = 0;
        double calif = 0;

        while (calif != -1) {
                String input = JOptionPane.showInputDialog("Ingrese calificación o -1 para terminar:");
                if (input == null) break;
                calif = Double.parseDouble(input);

                if (calif != -1) {
                    if (calif >= 0 && calif <= 10) { //rango de calificaciones
                        suma += calif;
                        contador++;
                        if (calif >= 7) aprobados++; else reprobados++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Calificacion erronea (0-10).");
                    }
                }
        }

        if (contador > 0) {
            double promedio = suma / contador;
            JOptionPane.showMessageDialog(null, "Resultados:\nPromedio: " + promedio +
                    "\nAprobados: " + aprobados + "\nReprobados: " + reprobados);
        }
    }
}
