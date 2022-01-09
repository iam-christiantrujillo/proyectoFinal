/**
 * Paquete que contiene las clases de cada Platillo en el menú. 
 */
package restaurante.platillos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Mole es una clase que hereda de la clase abstracta Platillo. La utilizamos para crear el platillo Mole.
 * @author Equipo 10 POO
 */
public class Mole extends Platillo{
    private static int precio = 180;
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

/**
 * Muestra los ingredientes que el Mole tiene como default.
 */
    public static void mostrarIngredientesD(){
        System.out.println("\tIngredientes: Pollo, Chile ancho, Chile mulato, Chile pasilla\n");
    }

/**
 * Retorna un ArrayList que contiene los ingredientes del Mole.
 * @return Devuelve un ArrayList que contiene los ingredientes del Mole.
 */
    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }

/**
 * Retorna un entero que representa el precio del platillo Mole.
 * @return Devuelve un entero que representa el precio del platillo Mole.
 */
    public static int getPrecio(){
        return precio;
    }

/**
 * Retorna un entero que representa las ventas totales que ha tenido el platillo Mole.
 * @return Devuelve un entero que representa las ventas totales que ha tenido el platillo Mole.
 */
    public static int getVentas(){
        return ventas;
    }

/**
 * Recibe como parámetro un entero que representa la cantidad a sumar a las ventas totales del Mole.
 * @param aSumar Entero que representa la cantidad a sumar a las ventas totales del Mole.
 */
    public static void setVentas(int aSumar){
        ventas += aSumar;
    }

/**
 * Crea un Mole agregando a su ArrayList de ingredientes los ingredientes del Mole.
 */
    public Mole(){
        Scanner sc = new Scanner(System.in);
        boolean paso = false;

        while(paso != true){
            System.out.println("\nQuieres arroz en tu mole?");
            System.out.println("1) Si");
            System.out.println("2) No");
        
            int tipo=sc.nextInt();
            if (tipo==1){
                ingredientes.add("Arroz");
                paso=true;
            }else if(tipo==2){
                paso=true;
            }else{
                System.out.println("\nOpcion no valida");
            }
        }

        ingredientes.add("Pollo");
        ingredientes.add("Chile ancho");
        ingredientes.add("Chile mulato");
        ingredientes.add("Chile pasilla");
    }

/**
 * Imprime en pantalla la historia del Mole.
 */
    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Se cree que el Mole fue creado en el Convento de Santa Rosa en el año 1681 por Sor Andrea de la Asuncion. Segun cuentan en el convento, la monja creo el mole con inspiracion divina.");
        System.out.println("-------------------------------------\n");
    }

/**
 * Imprime en pantalla la información general del Mole.
 */
    public void mostrarInfo(){
        System.out.println("\t-----> Mole");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + Mole.getPrecio());
    }
}
