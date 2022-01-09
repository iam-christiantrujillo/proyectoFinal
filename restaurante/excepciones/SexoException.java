/**
 * Paquete que contiene las Excepciones que se pueden generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 */
package restaurante.excepciones;

/**
 * SexoException es una Excepción que se puede generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 * @author Equipo 10 POO
 */
public class SexoException extends Exception{
/**
 * Crea una excepción SexoException.
 */
    public SexoException(){
        super("El formato del sexo debe ser un caracter M o F, escrito en mayuscula y no puede ser un numero.");
    }
}