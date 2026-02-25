import javax.swing.JOptionPane;
public class EvaluacionAlumnos;{
    public static void main (String arg []){

    // Declaracion variables
        
            int calif1 = 0;
            int calif2 = 0;
            int califproyec = 0; 
            double promfin = 0.0;
            double promedio = 0.0;
            String Estatus = " ";
            String Mensaje = " ";
             
         // solicitar valores
            calif1= Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion del primer parcial"));
            calif2= Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion del segundo parcial"));
            califproyec= Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion del proyecto final"));

            promedio = (calif1 + calif2)/2
            promfin = (calif1 + calif2 + califproyec)/3

    if ( promedio>= 95 && califproyec>= 95){
        Mensaje = "Alumno con excelencia academica";
        Estatus = "Aprobado";

            if (promedio>=70 && califproyec>= 60){
                Estatus = "Aprobado";

            }else if (promedio>= 50 && califproyec <=69){
                Estatus = "Extraordinario";

            }else{
                promedio < 50
                Estatus = "Reprobado";
            }

            String salida = "===== Boleta =====" +
                    "\n Promedio Final: " + promfin
                    "\n Estatus academico: " + Estatus
                    "\n Mensaje:  " + Mensaje


            JOptionPane.showInputDialog(null, salida);
        }
    }
}