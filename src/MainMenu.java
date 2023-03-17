import javax.swing.JOptionPane;
public class MainMenu extends App{
    
    // Método main
    public static void main(String[] args) throws Exception {


        // Métodos
        ChangeTemp métodoTemp = new ChangeTemp();
        ChangeDivisas métodoDivisas = new ChangeDivisas();
        Salir métodoSalir = new Salir();


        // Invocadora del menú principal

        Object[] options = {"Convertidor de Divisas", "Convertidor de Temperatura", "Salir"};

        int choose = JOptionPane.showOptionDialog(null,"¿Qué conversión desear realizar?", "Convertidor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, 
        null, options, options[0]); 
        
        // Funcionalidades del menú

        if (choose == 2){ // Salir
            métodoSalir.endFunction();
        }

        if (choose == 0){ // Conversor de Divisas
            métodoDivisas.changeDivisas(getOpciones());
        }

        if (choose == 1){ // Conversor de Temp
            métodoTemp.changeTemp();
        }
    }
}   

       

