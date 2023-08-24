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
public class Reserva {
    public Cliente[] listaEspera;
    public Cliente[] clientes;
    public Habitacion[] habitaciones;
    int i = 0; 
    int j = 0;
    public void agregarHabitacion(Habitacion habitacion){ // método para agregar una habitación a la lista
        habitaciones[0+i] = habitacion;
        i++; 
    }
    public void agregarCliente(Cliente cliente){ // agregar clientes a la lista clientes
        clientes[0+j] = cliente;
        j++;
    }
}
