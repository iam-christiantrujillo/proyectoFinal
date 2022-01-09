/**
 * Paquete que contiene las Excepciones que se pueden generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 */
package restaurante.excepciones;

/**
 * PasswordException es una Excepción que se puede generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 * @author Equipo 10 POO
 */
public class PasswordException extends Exception{
/**
 * Crea una excepción PasswordException.
 */
    public PasswordException(){
        super("La contrasena debe contener por lo menos 4 caracteres.");
    }
}
