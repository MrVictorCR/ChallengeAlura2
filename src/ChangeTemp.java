import javax.swing.JOptionPane;

public class ChangeTemp{
       
        public void changeTemp(){

            boolean seguirPrograma = true;
            while(seguirPrograma){
                String [] opciones = {"Celcius a Fahrenheit", "Fahrenheit a Celcius"};
                int cambio = JOptionPane.showOptionDialog(null, "Elija una Opción:", "Conversor de Temperatura",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,opciones,opciones[0]);

                String valorX = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir:");
                double valor = 0.0;
                try {
                     valor = Double.parseDouble(valorX);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Valor no válido");
                    System.exit(0);
                }

                double result = 0;

                // Funciones de las Conversiones
                if (cambio == 0){
                    result = ( valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null, valor + " Grados Celcius son: " + result + " Grados Fahrenheit");
                } else if (cambio == 1){
                    result = ( valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: " + result + " Grados Celcius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar con el programa?", ""
                    , JOptionPane.YES_NO_OPTION);

                if (continuar == JOptionPane.NO_OPTION){
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }
        }
}

