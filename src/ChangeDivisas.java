import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ChangeDivisas extends App{
    
    App métodosApp = new App();
    
    public void changeDivisas(Object [] opciones){
        
        DecimalFormat formatDivisas = new DecimalFormat("##.#");
            boolean seguirPrograma = true;
            while (seguirPrograma){

                
                métodosApp.setOpciones(getOpciones());
                                        //"Euros a Colones", "Dólares a Colones", "Lirbas Esterlinas a Colones", "Yen a Colones", "Won a Colones"};

                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Opción:", "Conversor de Moneda",
                    JOptionPane.QUESTION_MESSAGE, null,opciones,opciones[0]);
                
                

                    String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de colones:");
                    double colones = 0.0;
                    
                    // Try en caso de que agregue un tipo Caracter
                    try{
                        colones = Double.parseDouble(input);

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor no válido");
                    }

                    if (cambio.equals("Colones a Euros")){

                        double euros = colones / 588.44;
                        JOptionPane.showMessageDialog(null, colones + " Colones costarricenses son: " + formatDivisas.format(euros) + " Euros.");

                    } else if (cambio.equals("Colones a Dólares")){

                        double dolares = colones / 548.48;
                        JOptionPane.showMessageDialog(null, colones + " Colones costarricenses son: " + formatDivisas.format(dolares) + " Dólares.");

                        
                    } else if (cambio.equals("Colones a Libras Esterlinas")){

                        double libras = colones / 668.16;
                        JOptionPane.showMessageDialog(null, colones + " Colones costarricenses son: " + formatDivisas.format(libras) + " Libras Esterlinas.");
                        
                    } else if (cambio.equals("Colones a Yen")){

                        double yen = colones / 4.12;
                        JOptionPane.showMessageDialog(null, colones + " Colones costarricenses son: " + formatDivisas.format(yen) + " Yen.");
                        
                    } else if (cambio.equals("Colones a Won")){

                        double won = colones / 0.42;
                        JOptionPane.showMessageDialog(null, colones + " Colones costarricenses son: " + formatDivisas.format(won) + " Won.");
                        
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

