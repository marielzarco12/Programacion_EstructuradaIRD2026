import javax.swing.JOptionPane;
public class Menu {
    public static void main (String[] args) {
        // ciclos
        String menu = " ", opcion = " ";
        boolean sentinel = true;

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
