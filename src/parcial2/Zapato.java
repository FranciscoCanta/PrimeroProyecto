package parcial2;

public abstract class Zapato implements Comparable<Zapato> {   //¿Qué es una clase abstracta?   //Yo no puedo crear una instancia de Zapato. 
    
    //Con un solo método abstracto en esta clase la clase se vuelve abstracta (Esto no quiere decir que otros métodos que cree
    //deban ser  o Sí abstractos). 
    //Una clase abstracta puede tener métodos con cuerpo y métodos sin cuerpo. 

    private String nombre;
    private Double precio;    //TENER MUCHO CUIDADO CON ESTO SI QUEREMOS UTILIZAR EL COMPARABLE. 
    private int stock;

    //Constructor
    public Zapato(String nombre, Double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //Métodos adicionales
    public void mostarInformacion() {

        System.out.println("Zapato{" + "nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "}");
    }

    @Override
    public int compareTo(Zapato t) {  //Explicar esto 

        return precio.compareTo(t.precio);

    }

}
