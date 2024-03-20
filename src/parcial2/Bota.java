package parcial2;

public class Bota extends Zapato {

    private double talla;

    //Constructor 
    public Bota(String nombre, double precio, int stock, double talla) {
        super(nombre, precio, stock);
        this.talla = talla;
    }

    @Override
    public void mostarInformacion() {
        super.mostarInformacion();
        System.out.println(" Talla: " + talla);
        System.out.println("una cosa que agregué");
    }

}
