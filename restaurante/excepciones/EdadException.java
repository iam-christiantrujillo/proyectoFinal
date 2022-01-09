/**
 * Paquete que contiene las Excepciones que se pueden generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 */
package restaurante.excepciones;

/**
 * EdadException es una Excepción que se puede generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 * @author Equipo 10 POO
 */
public class EdadException extends Exception{
/**
 * Crea una excepción EdadException.
 */
    public EdadException(){
        super("La edad debe ser mayor a 0 y menor a 100 años y no puede contener letras.");
    }
}
