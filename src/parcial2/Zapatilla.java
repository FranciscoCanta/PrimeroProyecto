package parcial2;

public class Zapatilla extends Zapato implements Oferta {

    private String marca;

    //Constructor 
    public Zapatilla(String nombre, double precio, int stock, String marca) {
        super(nombre, precio, stock);
        this.marca = marca;
    }

    @Override
    public void mostarInformacion() {
        super.mostarInformacion();
        System.out.println("Marca: " + marca);
    }

    @Override
    public void calcularDescuento(int porcentaje) {   //Explicar esto 

        this.setPrecio(this.getPrecio() - ((this.getPrecio() * porcentaje) / 100));
    }


    
    
    
    
}
