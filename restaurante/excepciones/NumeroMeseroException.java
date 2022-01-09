/**
 * Paquete que contiene las Excepciones que se pueden generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 */
package restaurante.excepciones;

/**
 * NumeroMeseroException es una Excepción que se puede generar durante el registro o modificación de una Persona perteneciente al Restaurante.
 * @author Equipo 10 POO
 */
public class NumeroMeseroException extends Exception{
/**
 * Crea una excepción NumeroMeseroException.
 */
    public NumeroMeseroException(){
        super("El numero del mesero no puede contener letras y debe tener 3 digitos.");
    }
}
