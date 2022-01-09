/**
 * Paquete que contiene las clases de cada Persona que trabaja en el Restaurante.
 */
package restaurante.personas;
import restaurante.excepciones.*;

/**
 * Mesero es una clase que hereda de la clase abstracta Persona. La utilizamos para crear la persona Mesero.
 * @author Equipo 10 POO
 */
public class Mesero extends Persona {
    private int numMesero;
    private boolean atendiendo = false;
    private int ventasTotales=0;
    private int numPlatillosV=0;

/**
 * Crea un Mesero.
 */
    public Mesero(){

    }
    
/**
 * Crea un Mesero recibiendo como parámetro cada uno de sus datos. 
 * @param userName String que representa el nombre de usuario del Mesero.
 * @param passW String que representa la contraseña del Mesero.
 * @param numMesero String que representa el número del Mesero.
 * @param nombre String que representa el nombre del Mesero.
 * @param edad Entero que representa la edad del Mesero.
 * @param sexo String que representa el sexo del Mesero.
 * @param telefono Long que representa el teléfono del Mesero.
 */
    public Mesero(String userName, String passW,int numMesero,String nombre, int edad, String sexo, long telefono){
        super(userName, passW, nombre, edad, sexo, telefono);
        this.numMesero=numMesero;
    }

/**
 * Retorna un entero que representa el número del Mesero.
 * @return Devuelve un entero que representa el número del Mesero.
 */
    public int getNumMesero(){
        return numMesero;
    }

/**
 * Recibe un String que representa el número del Mesero.
 * @param nuevo String que representa el número del Mesero.
 * @throws NumeroMeseroException Genera excepción NumeroMeseroException cuando el formato del número no es el correcto. 
 */
    public void setNumMesero(String nuevo) throws NumeroMeseroException{
        int number;
        if(nuevo.length()!=3){
            throw new NumeroMeseroException();
        }else{
            try {
                number = Integer.parseInt(nuevo);
                this.numMesero=number;
            } catch (NumberFormatException e) {
                throw new NumeroMeseroException();
            }
        }
        
    }

/**
 * Retorna un booleano que representa si el Mesero está atendiendo o no.
 * @return Devuelve un booleano que representa si el Mesero está atendiendo o no.
 */
    public boolean getAtendiendo(){
        return atendiendo;
    }

/**
 * Recibe un booleano que representa un cambio en el estado del atributo del Mesero atendiendo, si está atendiendo o no. 
 * @param cambio Booleano que representa si el Mesero está atendiendo o no.
 */
    public void setAtendiendo(boolean cambio){
        this.atendiendo = cambio;
    }

/**
 * Retorna un entero que representa las ventas totales del Mesero.
 * @return Devuelve un entero que representa las ventas totales del Mesero.
 */
    public int getVentasTotales(){
        return ventasTotales;
    }

/**
 * Recibe como parámetro un entero que representa la cantidad a sumar a las ventas totales del Mesero.
 * @param aSumar Entero que representa la cantidad a sumar a las ventas totales del Mesero.
 */
    public void setVentasTotales(int aSumar){
        this.ventasTotales+=aSumar;
    }

/**
 * Retorna un entero que representa el número total de platillos vendidos por el Mesero.
 * @return Devuelve un entero que representa el número total de platillos vendidos por el Mesero.
 */
    public int getNumPlatillosV(){
        return numPlatillosV;
    }

/**
 * Recibe como parámetro un entero que representa el número total de platillos vendidos por el Mesero.
 * @param aSumar Entero que representa el número total de platillos vendidos por el Mesero.
 */
    public void setNumPlatillosV(int aSumar){
        this.numPlatillosV+=aSumar;
    }

/**
 * Imprime en pantalla la información general del Mesero.
 */
    public void mostrarInfo(){
        System.out.println("--------> Mesero");
        System.out.println("Numero de identificacion: "+this.getNumMesero());
        System.out.println("Ventas totales: $"+this.getVentasTotales());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Telefeno: "+this.getTelefono());
        System.out.println("Atendiendo mesa: "+this.getAtendiendo());
    }
}
