public class verificacionAplicada {
    import javax.swing.JOptionPane;
    public static void main (String[] args) {

        double promedio= 0.0, calif1 = 0.0, calif2 = 0.0, calif3 = 0.0;
        
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 1"));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 2"));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion 3"));

        promedio = (calif1 + calif2 + calif3)/3;
        

        if(promedio >= 7.0) {
            if(promedio=7.1 && promedio <=7.5){
                JOptionPane.showMessageDialog(null, "Aprobado bajo");
            }else if {(promedio>=7.6 && promedio<=8.7)
                JOptionPane.showMessageDialog(null, "Aprobado medio");
            }else{
               JOptionPane.showMessageDialog(null, "Aprobado alto"); 
            }
            JOptionPane.showMessageDialog(null, "Aprobado");
        }else{
            JOptionPane.showMessageDialog(null, "Aprobado");
        }
}