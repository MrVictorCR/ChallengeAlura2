import javax.swing.JOptionPane;

public class MainMenu extends App{
    
    public static void main(String[] args) throws Exception {

        // Métodos
        ChangeTemp métodoTemp = new ChangeTemp();
        ChangeDivisas métodoDivisas = new ChangeDivisas();
        Salir métodoSalir = new Salir();

         // Menú Principal
       
         Object[] options = {"Convertidor de Divisas", "Convertidor de Temperatura", "Salir"};
         int choose = JOptionPane.showOptionDialog(null,"¿Qué conversión desear realizar?", "Convertidor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
             null, options, options[0]);

     

         // Opciones del menú

         if (choose == 2){ // Salir

            métodoSalir.endFunction();

        }

     
        if (choose == 0){ // Conversor de Divisas
            
            métodoDivisas.changeDivisas();

        }
            
        

        if (choose == 1){ // Conversor de Temp

            métodoTemp.changeTemp();

        }
    }

        

        

        


}

