package buho_transporte;

public class Ruta {
    private String nombre;
    private double precio;

    public Ruta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método personalizado
    @Override
    public String toString() {
        return "Ruta: " + nombre + ", Precio: $" + precio;
    }
}
