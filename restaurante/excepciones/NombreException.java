/**
 * Paquete que contiene las Excepciones que se pueden generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 */
package restaurante.excepciones;

/**
 * NombreException es una Excepción que se puede generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 * @author Equipo 10 POO
 */
public class NombreException extends Exception{
/**
 * Crea una excepción NombreException.
 */
    public NombreException(){
        super("El nombre no puede contener digitos y la primera letra tiene que ser mayuscula.");
    }
}
