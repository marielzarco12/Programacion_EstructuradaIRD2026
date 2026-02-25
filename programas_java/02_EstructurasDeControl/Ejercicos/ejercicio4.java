import javax.swing.JOptionPane;
public class CreditoBancario;{
    public static void main (String arg []){

    // Declaracion variables

            int Antiguedad= 0;
            int HistorialCreditio = 0; 
            double IngresoMensual = 0.0;
            String palabra = " ";
            String Mensaje = " ";
             
         // solicitar valores
            IngresoMensual= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto mensual: "));
            Antiguedad= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la antiguedad: "));
            HistorialCreditio= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de tu historial crediticio: "));


            if ( IngresoMensual>= 12000 && Antiguedad>= 2 ){
                Mensaje = "Credito aprobado";
                HistorialCreditio = 3 ;
                palabra = "Historial malo";

           
            }else if (IngresoMensual>= 8000 && Antiguedad>= 1){
                Mensaje = "Credito condicionado"
                HistorialCreditio = 2;
                palabra = "Historial regular";

            }else{
                IngresoMensual >= 25000
                Mensaje = "Cliente es candidato a credito premium";
            }

            String salida = "===== Resultado =====" +
                    "\n Estado de credito: " + Mensaje
                    "\n Tipo de historial: " + palabra
                    "\n Antiguedad:  " + Antiguedad
                    "\n Ingreso Mensual:  " + IngresoMensual


            JOptionPane.showInputDialog(null, salida);
        }
    }
}