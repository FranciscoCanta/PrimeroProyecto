package parcial2;

public class Sandalia extends Zapato {

    private String estilo;

    //Constructor 
    public Sandalia(String nombre, double precio, int stock, String estilo) {
        super(nombre, precio, stock);
        this.estilo = estilo;
    }

    @Override
    public void mostarInformacion() {
        super.mostarInformacion();
        System.out.println(" Estilo: " + estilo);
    }

}
