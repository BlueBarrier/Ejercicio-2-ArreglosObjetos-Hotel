/**
 * Universidad del Valle DE Guatemala
 * Departamento de Ciencias de la Computación
 * Programación Orientada a Objetos - CC2008 - 50
 * 
 * @author: Erick Barrera - 231238
 * @Description: Clase Cliente, crea instancias del tipo Cliente almacenando la información de cada cliente y clasificandolos según su tipo
 * @version: 1.0
 * @Fecha: 23/08/2023
 * @Fecha_ultima_modificación: 23/08/2023
 */
public class Cliente{
    public String nombre, tipo;
    public int estadia, ocupantes, visitasAnt;
    public boolean asignado;
    Cliente(String nombre, int estadia, int ocupantes, int visitasAnt){
        this.nombre = nombre;
        this.estadia = estadia;
        this.ocupantes = ocupantes;
        this.visitasAnt = visitasAnt;
        this.asignado = false;
        this.tipo = "No determinado";
    }
    // getters y setters
    public String getNombre() {return nombre;}
    public int getEstadia() {return estadia;}
    public int getOcupantes() {return ocupantes;}
    public int getVisitasAnt() {return visitasAnt;}
    public boolean getAsignado(){return asignado;}
    public String getTipo() {return tipo;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEstadia(int estadia) {this.estadia = estadia;}
    public void setOcupantes(int ocupantes) {this.ocupantes = ocupantes;}
    public void setVisitasAnt(int visitasAnt) {this.visitasAnt = visitasAnt;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setAsignado(boolean asignado) {this.asignado = asignado;}
    
    public void asignarTipo(int visitas){
        if(visitas<5 && visitas>=0){
            setTipo("Regular");
        }else if(visitas>=5 && visitas<10){
            setTipo("Frecuentes");
        }else if(visitas>=10){
            setTipo("VIP");
        }
    }
}