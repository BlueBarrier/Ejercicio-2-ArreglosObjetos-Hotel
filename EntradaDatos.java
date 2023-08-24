/**
 * Universidad del Valle DE Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @Description: Clase EntraDatos, clase de consulta de datos entre el usuario y el programa.
 * @version: 1.0
 * @Fecha: 23/08/2023
 * @Fecha_ultima_modificación: 23/08/2023
 */
import java.util.Scanner;
public class EntradaDatos {
    private Scanner scanner = new Scanner(System.in);

    public String pedirNombre(){ // método para pedir nombre del cliente 
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        return nombre;
    }
    public int pedirEstadia(){ // método para pedir la cantidad de noches que se quedará el cliente
        System.out.println("Ingrese la cantidad de noches que se hospedará: ");
        int estadia = scanner.nextInt();
        scanner.nextLine();
        return estadia;
    }
    public int pedirOcupantes(){ // método para pedir la cantidad de ocupantes al cliente
        System.out.println("Ingrese la cantidad de ocupantes que se hospedarán: ");
        int ocupantes = scanner.nextInt();
        scanner.nextLine();
        return ocupantes;
    }
    public int pedirVisitas(){ // método para pedir la cantidad de visitas realizadas al cliente 
        System.out.println("Ingrese la cantidad de visitas que ha realizado a nuestro hotel: ");
        int visitas = scanner.nextInt();
        scanner.nextLine();
        return visitas;
    }

    // Métodos para pedir información de habitación al empleado
    public int pedirNumeroHabitacion(){ // método para pedir el número de una habitación
        System.out.println("Ingrese el número de la habitación: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
    public String tipoHabitacion(){ // método para pedir el tipo de habitación
        System.out.println("Ingrese el tipo de habitación: ");
        String tipo = scanner.nextLine();
        return tipo;
    }
    public int ocupacionMax(){ // método para pedir la cantidad de ocupantes máximos de una habitación
        System.out.println("Ingrese la cantidad de ocupantes máxima de la habitación: ");
        int ocumax = scanner.nextInt();
        scanner.nextLine();
        return ocumax;
    }
    public double pedirPrecioHabitacion(){ // método para pedir el precio de la habitación 
        System.out.println("Ingrese el precio por noche de la habitación: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        return precio;
    }
    
    // método para mostrar menú y pedir opción deseada
    public int pedirOpcion(){
        System.out.println("Ingrese la opción deseada \n"+
                            "1. Tomar datos huésped\n"+
                            "2. Ingresar nueva habitación\n"+
                            "3. Asignar una habitación al huésped");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;        
    }
}
