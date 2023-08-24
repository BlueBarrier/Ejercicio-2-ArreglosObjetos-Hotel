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

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EntradaDatos entradaDatos = new EntradaDatos();
        Reserva reserva = new Reserva();
        boolean salir = false;
        while (!salir) {
            System.out.println("Ingrese la opción deseada: ");
            System.out.println("1. Agregar nueva habitación");
            System.out.println("2. Agregar nuevo cliente");
            System.out.println("3. Realizar reserva");
            System.out.println("4. Ver reservas");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    int numero = entradaDatos.pedirNumeroHabitacion();
                    String tipo = entradaDatos.tipoHabitacion();
                    int ocumax = entradaDatos.ocupacionMax();
                    double precio = entradaDatos.pedirPrecioHabitacion();

                    Habitacion habitacion = new Habitacion(numero, tipo, ocumax, precio);
                    reserva.agregarHabitacion(habitacion);
                    break;
                case 2:
                    String nombre = entradaDatos.pedirNombre();
                    int estadia = entradaDatos.pedirEstadia();
                    int ocupantes = entradaDatos.pedirOcupantes();
                    int visitasAnt = entradaDatos.pedirVisitas();

                    Cliente cliente = new Cliente(nombre, estadia, ocupantes, visitasAnt);
                    cliente.asignarTipo(visitasAnt);
                    reserva.agregarCliente(cliente);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.println("Ingrese el número de la habitación: ");
                    int numeroHabitacion = scanner.nextInt();
                    scanner.nextLine();

                    Cliente clienteReserva = null;
                    for (Cliente c : reserva.getClientes()) {
                        if (c.getNombre().equals(nombreCliente)) {
                            clienteReserva = c;
                            break;
                        }
                    }

                    Habitacion habitacionReserva = null;
                    for (Habitacion h : reserva.getHabitaciones()) {
                        if (h.getNumero() == numeroHabitacion) {
                            habitacionReserva = h;
                            break;
                        }
                    }

                    if (clienteReserva != null && habitacionReserva != null) {
                        boolean resultado = reserva.reservar(clienteReserva, habitacionReserva);
                        if(clienteReserva.getTipo() == habitacionReserva.getTipo()){
                            if (resultado) {
                                System.out.println("Reserva realizada con éxito");
                            } else {
                                System.out.println("No se pudo realizar la reserva");
                            }
                        } else{System.out.println("Lo sentimos, la clasificación del cliente no coincide con el tipo de habitación");}
                    }else {
                        System.out.println("No se encontró al cliente o la habitación especificados");
                    }
                    break;
                case 4:
                    System.out.println("Reservas:");
                    for (Cliente c : reserva.getClientes()) {
                        if (c.getAsignado()) {
                            System.out.println("Cliente: " + c.getNombre());
                            for (Habitacion h : reserva.getHabitaciones()) {
                                if (h.getReserva()) {
                                    System.out.println("Habitación: " + h.getNumero());
                                    break;
                                }
                            }
                        }
                    }
                break;
                
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        scanner.close();
    }
}



