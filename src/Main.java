import buho_transporte.*;

public class Main {
    public static void main(String[] args) {
        // Crear rutas
        Ruta rutaQuitoGuayaquil = new Ruta("Quito-Guayaquil", 20);
        Ruta rutaQuitoTulcan = new Ruta("Quito-Tulcán", 17.50);

        // Crear servicios
        Servicio internet = new Servicio("Internet", "Acceso a internet durante el viaje");
        Servicio tv = new Servicio("Televisión", "Televisión por satélite");

        // Crear pasajeros
        Pasajero pasajero1 = new Pasajero("Juan", "Perez", "1234567890");
        Pasajero pasajero2 = new Pasajero("Ana", "Gomez", "0987654321");

        // Crear tickets con valores iniciales
        Normal ticket1 = new Normal(pasajero1, rutaQuitoGuayaquil, "Ventana");
        ticket1.agregarServicio(internet);

        VIP ticket2 = new VIP(pasajero2, rutaQuitoTulcan);
        ticket2.agregarServicio(internet);
        ticket2.agregarServicioAdicional("Snack");

        // Crear tickets adicionales
        Normal ticket3 = new Normal(new Pasajero("Carlos", "Ramirez", "1122334455"), new Ruta("Quito-Puyo", 15), "Pasillo");
        ticket3.agregarServicio(tv);

        VIP ticket4 = new VIP(new Pasajero("Maria", "Lopez", "2233445566"), new Ruta("Quito-Riobamba", 17.50));
        ticket4.agregarServicio(internet);
        ticket4.agregarServicioAdicional("Bebidas");

        VIP ticket5 = new VIP(new Pasajero("Luis", "Martinez", "3344556677"), new Ruta("Quito-Guayaquil", 20));
        ticket5.agregarServicio(tv);
        ticket5.agregarServicioAdicional("Comida");

        // Imprimir información de los objetos
        imprimirTicket(ticket1);
        imprimirTicket(ticket2);
        imprimirTicket(ticket3);
        imprimirTicket(ticket4);
        imprimirTicket(ticket5);
    }

    public static void imprimirTicket(Ticket ticket) {
        System.out.println(ticket);
        System.out.println("---------------------------");
    }
}
