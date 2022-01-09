/**
 * Paquete que contiene las Excepciones que se pueden generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 */
package restaurante.excepciones;

/**
 * UserNameException es una Excepción que se puede generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 * @author Equipo 10 POO
 */
public class UserNameException extends Exception{
/**
 * Crea una excepción UserNameException.
 */
    public UserNameException(){
        super("El nombre de usuario no puede contener mayusculas y debe contener por lo menos 4 caracteres.");
    }
}
