import javax.swing.JOptionPane;

public class Salir extends App{

        static App salir = new App();
    
        
        public void endFunction(){
    
            salir.setChoose(2);

            JOptionPane.showMessageDialog(null, "Programa finalizado");
            System.exit(0);
            
        }
}