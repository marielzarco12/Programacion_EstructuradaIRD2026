import javax.swing.JOptionPane;
public class ProgramasConFor {
    public static void main (String[] args){
        String menu = " ", opcion = " ";
        boolean sentinel = true;
        int n=0;
        double prom=0.0, calif=0.0;
        

        menu = "====== Menu general ======\n" +
                "1)Opcion 1 \n" +
                "2)Opcion 2 \n" +
                "3)Opcion 3 \n" +
                "4)S \n" +
                "elegir opcion: ";

        // aqui va el ciclo ya que va a construir la opcion
        do{
            opcion = JOptionPane.showInputDialog(null, menu);

            switch(opcion.toUpperCase()) {
                case "1":
                case "A":
                    n = Integer.parseInt
                            (JOptionPane.showInputDialog
                                    ("Ingresa el numero de calificacion"));
                    if (n > 0) {
                        prom = 0.0;
                        for (int i = 1; i <=n ; i++) {
                            calif = Double.parseDouble
                                    (JOptionPane.showInputDialog
                                            ("Ingresa la calificacion " + i));
                            if (calif >= 0.0 && calif <= 10.0) {

                            } else {
                                JOptionPane.showMessageDialog
                                        (null, " el numero de calificacion no puede ser cero");
                                i--;  // i = i - 1
                            }
                        }   
                    } prom/n; // prom= prom / n;
                        JOptionPane.showMessageDialog
                            (null,"el promedio es: "+prom);
                      
                        JOptionPane.showMessageDialog(null,"El numero de calificaciones no puede ser negativo");
                    }
                    JOptionPane.showInputDialog(null, "Opcion 1");
                    break;

                case "2":
                case "B":
                    JOptionPane.showInputDialog(null, "Opcion 2");
                    break;
                case "3":
                case "C":
                    JOptionPane.showInputDialog(null, "Opcion 3");
                    break;
                case "4":
                case "S":
                    JOptionPane.showInputDialog(null, "Opcion no salir");
                    sentinel = false
                    break;
                default:
                    JOptionPane.showInputDialog(null, "Opcion no valido");

            }
        }while (sentinel);
    }
}
