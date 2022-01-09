/**
 * Paquete que contiene las clases de cada Platillo en el menú. 
 */
package restaurante.platillos;
import java.util.ArrayList;

/**
 * QuesoRelleno es una clase que hereda de la clase abstracta Platillo. La utilizamos para crear el platillo Queso Relleno. 
 * @author Equipo 10 POO
 */
public class QuesoRelleno extends Platillo{
    private static int precio = 120;
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

/**
 * Muestra los ingredientes que el Queso Relleno tiene como default.
 */
    public static void mostrarIngredientesD(){
        System.out.println("\tIngredientes: Picadillo, Queso de bola holandes\n");
    }

/**
 * Retorna un ArrayList que contiene los ingredientes del Queso Relleno.
 * @return Devuelve un ArrayList que contiene los ingredientes del Queso Relleno.
 */
    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }

/**
 * Retorna un entero que representa el precio del platillo Queso Relleno.
 * @return Devuelve un entero que representa el precio del platillo Queso Relleno.
 */
    public static int getPrecio(){
        return precio;
    }

/**
 * Retorna un entero que representa las ventas totales que ha tenido el platillo Queso Relleno.
 * @return Devuelve un entero que representa las ventas totales que ha tenido el platillo Queso Relleno.
 */
    public static int getVentas(){
        return ventas;
    }

/**
 * Recibe como parámetro un entero que representa la cantidad a sumar a las ventas totales del Queso Relleno.
 * @param aSumar Entero que representa la cantidad a sumar a las ventas totales del Queso Relleno.
 */
    public static void setVentas(int aSumar){
        ventas += aSumar;
    }

/**
 * Crea un Queso Relleno agregando a su ArrayList de ingredientes los ingredientes del Queso Relleno.
 */
    public QuesoRelleno(){
        ingredientes.add("Picadillo");
        ingredientes.add("Queso de bola holandes");
        
    }

/**
 * Imprime en pantalla la historia del Queso Relleno.
 */
    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Para varios especialistas e historiadores locales, el Queso Relleno es la maxima expresion del arte gastronomico de la region yucateca, es un autentico simbolo del mestizaje y esta considerado por varios un platillo superior a nuestra popular cochinita pibil.");
        System.out.println("-------------------------------------\n");
    }
    
/**
 * Imprime en pantalla la información general del Queso Relleno.
 */
    public void mostrarInfo(){
        System.out.println("\t-----> Queso relleno");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + QuesoRelleno.getPrecio());
    }
}
