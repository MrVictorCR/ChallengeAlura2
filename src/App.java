public class App{
 
    // Variables

        // Menú opciones de Divisas
    private static Object [] opciones = {"Colones a Euros", "Colones a Dólares", "Colones a Libras Esterlinas", "Colones a Yen", "Colones a won",
                                            "Euros a Colones", "Dólares a Colones", "Libras Esterlinas a Colones", "Yen a Colones", "Won a Colones"};
    

    // Getters and Setters

        // Variable opciones
    public static Object[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Object[] opciones) {
        App.opciones = opciones;
    }

}
