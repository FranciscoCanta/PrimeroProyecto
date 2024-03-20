package parcial2;

import java.util.ArrayList;
import java.util.Collections;

public class Zapateria {

    private ArrayList<Zapato> inventario;

    //Explicar esto 
    public Zapateria() {
        inventario = new ArrayList();
    }

    //Métodos adicionales
    public void agregarZapato(Zapato zapato) {

        inventario.add(zapato);

    }

    public void mostrarInventario() {

        for (Zapato zapato : inventario) {

            zapato.mostarInformacion(); 
        }

    }

    public void ordenarPorPrecio() {

        Collections.sort(inventario);

        mostrarInventario(); //Acá me va a mostrar el método ordenado 

    }
}
    
    
    

    

    
    

