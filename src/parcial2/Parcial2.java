package parcial2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Parcial2 {

    public static Zapato pedirDatos(String tipo) throws InputMismatchException, Exception { //propagar execpciones
        Zapato zapato = null;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese precio: ");
        double precio = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese stock: ");
        int stock = leer.nextInt();
        leer.nextLine();
        switch (tipo) {
            case "Zapatilla":
                System.out.println("Ingrese marca: ");
                String marca = leer.nextLine();
                zapato = new Zapatilla(nombre, precio, stock, marca);
                break;
            case "Sandalia":
                System.out.println("Ingrese estilo: ");
                String estilo = leer.nextLine();
                zapato = new Sandalia(nombre, precio, stock, estilo);
                break;
            case "Bota":
                System.out.println("Ingrese talla: ");
                int talla = leer.nextInt();
                leer.nextLine();
                zapato = new Bota(nombre, precio, stock, talla);
                break;
        }
        return zapato;
    }

    public static void main(String[] args) {

        //Zapato zapato1 = new Sandalia("Nike", 30, 50, "Playa");  //Para que haya Polimorfismo debe haber herencia y sobreescritura. (Polimorfismo = Muchas formas)
        //Zapato zapato2 = new Bota("Bota Larga", 70, 10, 37);
        //Zapato zapato3 = new Zapatilla("Adidas", 10, 100, "Truk");
        Zapateria zapateria = new Zapateria();
        
        System.out.println("Esto agregué en el proyecto para hacer un segundo commit");

        try {

            //Zapato zapatilla = pedirDatos("Zapatilla");
            Zapato sandalia = new Sandalia("Nike", 30, 50, "Playa");
            zapateria.agregarZapato(sandalia);

            //Zapato sandalia = pedirDatos("Sandalia");
            Zapato bota = new Bota("Bota Larga", 70, 10, 37);
            zapateria.agregarZapato(bota);

            //Zapato bota = pedirDatos("Bota");
            Zapato zapatilla = new Zapatilla("Adidas", 10, 100, "Truk");
            zapateria.agregarZapato(zapatilla);

            zapateria.mostrarInventario();  //Este me lo muestra desordenado

            System.out.println("---------------------");
            System.out.println("El inventario ordenado: ");
            zapateria.ordenarPorPrecio(); 

            System.out.println("El precio de la zapatilla con descuento: ");
            
            ((Zapatilla) zapatilla).calcularDescuento(15);
        
            zapateria.mostrarInventario();
            
        } catch (InputMismatchException a) {

            System.out.println("Error de tipeo de datos");

        } catch (Exception b) {

            System.out.println("Error general");

        } finally {

            System.out.println("En bloque finally");

        }

    }

}
