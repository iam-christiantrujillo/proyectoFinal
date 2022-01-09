/**
 * Paquete que contiene las clases de cada Platillo en el menú. 
 */
package restaurante.platillos;
import java.io.Serializable;

/**
 * Platillo es una clase abstracta que implementa la interfaz Serializable para que las clases que hereden de esta puedan ser guardadas en un archivo de objetos.
 * @author Equipo 10 POO
 */
public abstract class Platillo implements Serializable{

/**
 * Imprime en pantalla la historia de los platillos mexicanos. 
 */
    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Los platos tipicos Mexicanos son una de las gastronomias mas fuertes, variadas y que conservan muchos elementos de las Civilizaciones Antiguas.");
        System.out.println("-------------------------------------\n");
    }

/**
 * Método abstracto para establecer como regla que las clases que hereden de Platillo implementen este método. 
 */
    public abstract void mostrarInfo();
}
