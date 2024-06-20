
package buho_transporte;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    protected Pasajero pasajero;
    protected Ruta ruta;
    protected List<Servicio> servicios;
    protected double costo;

    public Ticket(Pasajero pasajero, Ruta ruta) {
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.servicios = new ArrayList<>();
        calcularCosto();
    }

    // Getters y Setters
    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
        calcularCosto();
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
        calcularCosto();
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public double getCosto() {
        return costo;
    }

    // Métodos personalizados
    protected void calcularCosto() {
        if (ruta != null) {
            this.costo = ruta.getPrecio();
        }
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    @Override
    public String toString() {
        return "Pasajero: " + pasajero + ", Ruta: " + ruta + ", Costo: $" + costo + ", Servicios: " + servicios;
    }
}
