/**
 * Paquete que contiene las Excepciones que se pueden generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 */
package restaurante.excepciones;

/**
 * TelefonoException es una Excepción que se puede generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 * @author Equipo 10 POO
 */
public class TelefonoException extends Exception{
/**
 * Crea una excepción TelefonoException.
 */
    public TelefonoException(){
        super("El telefono debe contener 10 digitos y no puede contener letras.");
    }
}
