import javax.swing.JOptionPane;

public class App{
 
    // Variables

        // Menú Principal
    


        // Menú opciones de Divisas
    private Object [] opciones = {"Colones a Euros", "Colones a Dólares", "Colones a Libras Esterlinas", "Colones a Yen", "Colones a won"};
    
        // Menú conversion
    private String cambio = (String) JOptionPane.showInputDialog(null, "Elija una Opción:", "Conversor de Moneda",
        JOptionPane.QUESTION_MESSAGE, null,opciones,opciones[0]);


    // Getters and Setters

        // Variable opciones
    public Object[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Object[] opciones) {
        this.opciones = opciones;
    }

        // Variable cambio
    public String getCambio() {
            return cambio;
    }
    
    public void setCambio(String cambio) {
            this.cambio = cambio;
    }


    public boolean startsWith(String string) {
        return false;
    }


}
