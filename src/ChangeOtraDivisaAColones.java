import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ChangeOtraDivisaAColones{

    App métodosApp = new App();
        public void changeOtrasDivisasAColones(Object[] opciones){

            DecimalFormat formatDivisas = new DecimalFormat("##.#");
            boolean seguirPrograma = true;
            while (seguirPrograma){
            
                // Conversiones desde Otra Moneda a Colones
           

            if (métodosApp.startsWith("Dólares")){
                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dólares:");
                double dólares = 0.0;
                
                try{
                    dólares = Double.parseDouble(input);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                }
                
                double colones = dólares * 548.48;
                JOptionPane.showMessageDialog(null, dólares + " Dólares son: " + formatDivisas.format(colones) + " Colones costarricenses.");

            } else if (métodosApp.startsWith("Euros")){
                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de euros:");
                double euros = 0.0;
                
                try{
                    euros = Double.parseDouble(input);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                }
                
                double colones = euros * 588.44;
                JOptionPane.showMessageDialog(null, euros + " Euros son: " + formatDivisas.format(colones) + " Colones costarricenses.");

            } else if (métodosApp.startsWith("Libras")){
                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de libras esterlinas:");
                double lies = 0.0;
                
                try{
                    lies = Double.parseDouble(input);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                }
                
                double colones = lies * 668.16;
                JOptionPane.showMessageDialog(null, lies + " Libras son: " + formatDivisas.format(colones) + " Colones costarricenses.");

            } else if (métodosApp.startsWith("Yen")){
                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de yen:");
                double yen = 0.0;
                
                try{
                    yen = Double.parseDouble(input);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                }
                
                double colones = yen * 4.12;
                JOptionPane.showMessageDialog(null, yen + " Yen son: " + formatDivisas.format(colones) + " Colones costarricenses.");

            } else if (métodosApp.startsWith("Won")){
                String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de Won:");
                double won = 0.0;
                
                try{
                    won = Double.parseDouble(input);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                }
                
                double colones = won * 0.42;
                JOptionPane.showMessageDialog(null, won + " Won son: " + formatDivisas.format(colones) + " Colones costarricenses.");

            }  

            int confirm = JOptionPane.showConfirmDialog(null, 
            "¿Desea continuar usando el programa?", "Confirmar", JOptionPane.YES_NO_OPTION);
                
            if(confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
                seguirPrograma = false;
                
            }
        }
    }
}


