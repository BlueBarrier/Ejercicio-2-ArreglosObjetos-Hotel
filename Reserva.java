/**
 * Universidad del Valle DE Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @Description: 
 * @version: 1.0
 * @Fecha: 24/08/2023
 * @Fecha_ultima_modificación: 24/08/2023
 */
import java.util.ArrayList;

public class Reserva {
    private ArrayList<Cliente> clientes;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Cliente> enEspera;

    public Reserva() {
        this.clientes = new ArrayList<Cliente>();
        this.habitaciones = new ArrayList<Habitacion>();
        this.enEspera = new ArrayList<Cliente>();
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }

    public ArrayList<Cliente> getEnEspera() {
        return enEspera;
    }
    public void addEnEspera(Cliente esperado) {
        enEspera.add(esperado);
    }
    public void agregarHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public boolean reservar(Cliente cliente, Habitacion habitacion) {
        if (cliente.getAsignado() || habitacion.getReserva()) {
            return false;
        } else {
            cliente.setAsignado(true);
            habitacion.setReserva(true);
            return true;
        }
    }
    public void aEsperar(Cliente cliente){
        enEspera.add(cliente);
    }
    public void  getEspera(){
        System.out.println("Lista de clientes en espera: ");
        for(Cliente c : enEspera){
            int count = 1;
            System.out.printf("%d. %s \n",count, c.getNombre());
            count++;
        }
    }
}