/**
 * Paquete que contiene las clases de cada Platillo en el menú. 
 */
package restaurante.platillos;
import java.util.ArrayList;

/**
 * ChileNogada es una clase que hereda de la clase abstracta Platillo. La utilizamos para crear el platillo Chile en Nogada. 
 * @author Equipo 10 POO
 */
public class ChileNogada extends Platillo{
    private static int precio = 260;
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

/**
 * Muestra los ingredientes que el Chile en Nogada tiene como default.
 */
    public static void mostrarIngredientesD(){
        System.out.println("\tIngredientes: Chile poblano, Carne molida, Almendras, Granos de granada\n");
    }

/**
 * Retorna un ArrayList que contiene los ingredientes del Chile en Nogada.
 * @return Devuelve un ArrayList que contiene los ingredientes del Chile en Nogada.
 */
    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }

/**
 * Retorna un entero que representa el precio del platillo Chile en Nogada.
 * @return Devuelve un entero que representa el precio del platillo Chile en Nogada.
 */
    public static int getPrecio(){
        return precio;
    }

/**
 * Retorna un entero que representa las ventas totales que ha tenido el platillo Chile en Nogada.
 * @return Devuelve un entero que representa las ventas totales que ha tenido el platillo Chile en Nogada.
 */
    public static int getVentas(){
        return ventas;
    }

/**
 * Recibe como parámetro un entero que representa la cantidad a sumar a las ventas totales del Chile en Nogada.
 * @param aSumar Entero que representa la cantidad a sumar a las ventas totales del Chile en Nogada.
 */
    public static void setVentas(int aSumar){
        ventas += aSumar;
    }

/**
 * Crea un Chile en Nogada agregando a su ArrayList de ingredientes los ingredientes del Chile en Nogada.
 */
    public ChileNogada(){
        ingredientes.add("Chile poblano");
        ingredientes.add("Carne molida");
        ingredientes.add("Almendras");
        ingredientes.add("Granos de granada");
        
    }

/**
 * Imprime en pantalla la historia del Chile en Nogada.
 */
    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Se cree que fueron las madres Agustinas del Convento de Santa Monica, en Puebla, quienes en 1821 crearon los Chiles en Nogada con motivo de celebracion de la Independencia de Mexico y homenaje a Agustin de Iturbide.");
        System.out.println("-------------------------------------\n");
    }

/**
 * Imprime en pantalla la información general del Chile en Nogada.
 */
    public void mostrarInfo(){
        System.out.println("\t-----> Chile en nogada");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + ChileNogada.getPrecio());
    }
}
