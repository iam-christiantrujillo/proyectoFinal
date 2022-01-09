package restaurante;
import java.util.ArrayList;
import restaurante.platillos.Platillo;
import java.io.Serializable;

/**
 * Orden es una clase utilizada para guardar los Platillos solicitados por el cliente y de igual forma el precio total de esta orden. 
 * @author Equipo 10 POO
 */
public class Orden implements Serializable{
    private ArrayList<Platillo> arrOrden = new ArrayList<Platillo>();
    private int precioOrden =0;

/**
 * Retorna el ArrayList que contiene cada Platillo solicitado por el cliente.
 * @return Devuelve el ArrayList que contiene cada Platillo solicitado por el cliente.
 */
    public ArrayList<Platillo> getArrOrden(){
        return arrOrden;
    }

/**
 * Retorna el precio total de la orden.
 * @return Devuelve el precio total de la orden solicitada.
 */
    public int getPrecioOrden(){
        return precioOrden;
    }

/**
 * Recibe un entero que representa el precio total de la orden.
 * @param total Precio total de la orden. 
 */
    public void setPrecioOrden(int total){
        this.precioOrden=total;
    }

/**
 * Imprime en pantalla la información general de la Orden. 
 */
    public void mostrarInfo(){
        System.out.println("\n------------ Orden -----------\n");
        for(Platillo plato : arrOrden){
           
            plato.mostrarInfo();
            System.out.println("\n");
        }
        System.out.println("------------------------------");
    }

}
