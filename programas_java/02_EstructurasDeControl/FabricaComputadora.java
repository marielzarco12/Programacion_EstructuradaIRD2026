import javax.swing.JOptionPane;

         /*
        se planea ofrecer a los cliente un descuento ve dependera del numero de computadoras que compre.
        si las computadores sonmens de cinco se les dara un 10% de descuento sobre el total de la compra;
        si el numero de computadoras es mayor o igual a cinco pero menos de diez se le otorga el 20% de
        descuento; y son 10 o mas se les dara 40% de descuento; y si son 10 o mas se les da
         */
public class FabricaComputadoras {
         public static void main (String[] args){
          // Declaracion variables
             int numeroComp = 0;
             double precio = 0.0;
             double total =0.0;
             double descuento =0.0;
             double subtotal =0.0;
             String porcentaje = "";

         // solicitar valores
            numeroComp = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de computadoras"));
            precio = Double.parseDouble(JOptionPane.showInputDialog("precio de la computadora"));

            total = precio * numeroComp;

            if (numeroComp<5){
                descuento = total * 0.10;
                subtotal = total - descuento;
                total = subtotal - descuento;
                porcentaje = "10%";
            }else if (numeroComp>=5 && numeroComp<10){
                descuento = total * 0.20;
                subtotal = total - descuento;
                total = subtotal - descuento;
                porcentaje = "20%";
            }else{
                descuento = total * 0.40;
                subtotal = total - descuento;
                total = subtotal - descuento;
                porcentaje = "40%";
            }

            String salida = "===== TICKET =====" +
                    "\nSubtotal:$ " + subtotal +
                    "\nDescuento:$ " + (descuento * 100) +
                    "\n% porcentaje:$ " + porcentaje +
                    "\nTotal:$ " + total;
            JOptionPane.showInputDialog(null, salida);
    }
}