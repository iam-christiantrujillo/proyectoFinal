/**
 * Paquete que contiene las clases de cada Persona que trabaja en el Restaurante.
 */
package restaurante.personas;

/**
 * Administrador es una clase que hereda de la clase abstracta Persona. La utilizamos para crear la persona Administrador.
 * @author Equipo 10 POO
 */
public class Administrador extends Persona {

/**
 * Crea un Administrador.
 */
    public Administrador(){

    }

/**
 * Crea un Administrador recibiendo como parámetro cada uno de sus datos. 
 * @param userName String que representa el nombre de usuario del Administrador.
 * @param passW String que representa la contraseña del Administrador.
 * @param nombre String que representa el nombre del Administrador.
 * @param edad Entero que representa la edad del Administrador.
 * @param sexo String que representa el sexo del Administrador.
 * @param telefono Long que representa el teléfono del Administrador.
 */
    public Administrador(String userName, String passW,String nombre, int edad, String sexo, long telefono){
        super(userName, passW, nombre, edad, sexo, telefono);
    }

/**
 * Imprime en pantalla la información general del Administrador.
 */
    public void mostrarInfo(){
        System.out.println("--------> Administrador");
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Edad: "+this.getEdad());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Telefeno: "+this.getTelefono());
    }
}
