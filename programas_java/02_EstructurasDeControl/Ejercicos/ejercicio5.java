import javax.swing.JOptionPane;
public class SistemaCobroDepartamental;{
    public static void main (String arg []){

    // Declaracion variables
        
            int TipoCliente = 0;
            int FormaPago = 0;
            double MontoTotal = 0.0;
            double promedio = 0.0;
            double descuento = 0.0;
            double adicional = 0.5;
            double impuesto = 0.0;
            String PalabraTipo = " ";
            String PalaForm = " ";

             
         // solicitar valores
            TipoCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tipo de cliente: "));
            MontoTotal = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el monto total de la compra: "));
            FormaPago = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el metodo de pago: "));


    if ( TipoCliente = 1 && MontoTotal >= 5000){
        impuesto = MontoTotal - 0.8 ;
        FormaPago = 1 
        adicional = MontoTotal + 0.5;
        PalabraTipo = "Cliente normal";
        PalaForm = "Pago en efectivo";

            if (TipoCliente = 2 && MontoTotal >= 5000){
                impuesto = MontoTotal - 0.8 ;
                FormaPago = 2
                adicional = MontoTotal + 0.5;
                descuento = "0.10"
                PalabraTipo = "Miembro";
                PalaForm = "Pago con tarjeta";

            }else if (TipoCliente>= 3 && MontoTotal <=5000){
                impuesto = MontoTotal - 0.8 ;
                FormaPago = 1
                adicional = MontoTotal + 0.5;
                descuento = "0.20"
                PalabraTipo = "Empleado";
                PalaForm = "Pago con efectivo";

            }else{
                TipoCliente >= 1;
                MontoTotal < 5000;
                descuento = 0;
                FormaPago = 2;
                PalaForm = "pago con tarjeta";

                
            }

            String salida = "===== Ticket =====" +
                    "\n Tipo de cliente: " + PalabraTipo
                    "\n Montototal:  " + MontoTotal 
                    "\n Adicional: " + adicional
                    "\n IVA:  " + impuesto
                    "\n Forma de pago:  " + PalaForm



            JOptionPane.showInputDialog(null, salida);
        }
    }
}