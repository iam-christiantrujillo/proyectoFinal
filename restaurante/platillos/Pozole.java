/**
 * Paquete que contiene las clases de cada Platillo en el menú. 
 */
package restaurante.platillos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Pozole es una clase que hereda de la clase abstracta Platillo. La utilizamos para crear el platillo Pozole. 
 * @author Equipo 10 POO
 */
public class Pozole extends Platillo{
    private static int precio = 136;
    private static int ventas=0;
    private ArrayList<String> ingredientes = new ArrayList<String>();

/**
 * Muestra los ingredientes que el Pozole tiene como default.
 */
    public static void mostrarIngredientesD(){
        System.out.println("\tIngredientes: Carne al gusto, Rabanos, Lechuga, Maiz, Oregano\n");
    }

/**
 * Retorna un ArrayList que contiene los ingredientes del Pozole.
 * @return Devuelve un ArrayList que contiene los ingredientes del Pozole.
 */
    public ArrayList<String> getIngredientes(){
        return this.ingredientes;
    }

/**
 * Retorna un entero que representa el precio del platillo Pozole.
 * @return Devuelve un entero que representa el precio del platillo Pozole.
 */
    public static int getPrecio(){
        return precio;
    }

/**
 * Retorna un entero que representa las ventas totales que ha tenido el platillo Pozole.
 * @return Devuelve un entero que representa las ventas totales que ha tenido el platillo Pozole.
 */
    public static int getVentas(){
        return ventas;
    }

/**
 * Recibe como parámetro un entero que representa la cantidad a sumar a las ventas totales del Pozole.
 * @param aSumar Entero que representa la cantidad a sumar a las ventas totales del Pozole.
 */
    public static void setVentas(int aSumar){
        ventas += aSumar;
    }

/**
 * Crea un Pozole agregando a su ArrayList de ingredientes los ingredientes del Pozole.
 */
    public Pozole(){
        Scanner sc = new Scanner(System.in);

        boolean paso = false;

        while(paso!=true){
            System.out.println("\nQue tipo de carne quieres en tu pozole?");
            System.out.println("1) De Puerco");
            System.out.println("2) De Res");
            System.out.println("3) De Pollo");
            int tipo=sc.nextInt();
            switch(tipo){
                case 1:
                    ingredientes.add("Carne de puerco");
                    paso = true;
                    break;
                case 2:
                    ingredientes.add("Carne de res");
                    paso = true;
                    break;
                case 3:
                    ingredientes.add("Carne de Pollo");
                    paso = true;
                    break;
                default:
                    System.out.println("\nOpcion no valida.");
            }
        }
        
        ingredientes.add("Rabanos");
        ingredientes.add("Lechuga");
        ingredientes.add("Maiz");
        ingredientes.add("Oregano");
    }

/**
 * Imprime en pantalla la historia del Pozole.
 */
    public void mostrarHistoria(){
        System.out.println("\n------------ Dato curioso -----------");
        System.out.println("Se cree que el Pozole era consumido desde antes de la conquista, el emperador Moctezuma disfrutaba de un platillo de Pozole ofrendado al dios Xipe Totec, señor de la fertilidad y la regeneracion del maiz y la guerra.");
        System.out.println("-------------------------------------\n");
    }
    
/**
 * Imprime en pantalla la información general del Pozole.
 */
    public void mostrarInfo(){
        System.out.println("\t-----> Pozole");
        System.out.println("\tIngredientes: ");
        int contador = 0;
        for(String ingrediente: this.getIngredientes()){
            contador++;
            System.out.println("\t"+contador + ". " + ingrediente);
        }
        System.out.println("\tPrecio: $" + Pozole.getPrecio());
    }
    
}
