/**
 * Universidad del Valle DE Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @Description: Clase Habitación, crea instancias del tipo Habitación, guarda información de cada habitación
 * @version: 1.0
 * @Fecha: 23/08/2023
 * @Fecha_ultima_modificación: 23/08/2023
 */
public class Habitacion {
    public int numero, ocupacionMax;
    public double precio;
    public String tipo;
    public boolean reserva;
    Habitacion(int numero, String tipo, int ocupacionMax, double precio){
        this.numero = numero;
        this.tipo = tipo;
        this.ocupacionMax = ocupacionMax;
        this.precio = precio;
        this.reserva = false;
    }
    // getters y setters
    public int getNumero() {return numero;}
    public String getTipo() {return tipo;}
    public int getOcupacionMax() {return ocupacionMax;}
    public double getPrecio() {return precio;}
    public boolean getReserva(){return reserva;}

    public void setNumero(int numero) {this.numero = numero;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setOcupacionMax(int ocupacionMax) {this.ocupacionMax = ocupacionMax;}
    public void setPrecio(double precio) {this.precio = precio;}
    public void setReserva(boolean reserva) {this.reserva = reserva;}
}
