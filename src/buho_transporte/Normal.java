
package buho_transporte;

public class Normal extends Ticket {
    private String asiento;

    public Normal(Pasajero pasajero, Ruta ruta, String asiento) {
        super(pasajero, ruta);
        this.asiento = asiento;
    }

    // Getters y Setters
    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    // Método personalizado
    @Override
    public String toString() {
        return super.toString() + ", Asiento: " + asiento + " (Servicio: Normal)";
    }
}
