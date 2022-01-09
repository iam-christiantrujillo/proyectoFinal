package restaurante;
import restaurante.personas.Mesero;
import java.io.Serializable;

/**
 * Mesa es una clase utilizada para identificar cada mesa del restaurante. De igual forma para asociar estas a un Mesero y una Orden cuando se realice una de estas.
 * @author Equipo 10 POO
 */
public class Mesa implements Serializable{
    private int numMesa;
    private boolean ocupada = false;
    private Mesero meseroACargo;
    private Orden ordenMesa;
    private int ventasTotales=0;

/**
 * Crea una Mesa recibiendo como parámetro el número de identificación de la mesa.
 * @param numMesa Entero que representa el número de identificación de la mesa. 
 */
    public Mesa(int numMesa){
        this.numMesa= numMesa;
        
    }

/**
 * Retorna un entero que representa el número de identificación de la Mesa.
 * @return Devuelve el número de identificación de la Mesa.
 */
    public int getNumMesa(){
        return numMesa;
    }

/**
 * Retorna un booleano que representa si la mesa está ocupada o no.
 * @return Devuelve un booleano que representa si la mesa está ocupada o no.
 */
    public boolean getOcupada(){
        return ocupada;
    }

/**
 * Recibe un booleano que representa un cambio en el estado del atributo de la Mesa ocupada, si está ocupada o no. 
 * @param cambio Booleano que representa si la mesa está ocupada o no.
 */
    public void setOcupada(boolean cambio){
        this.ocupada=cambio;
    }

/**
 * Retorna un objeto de la clase Mesero que representa el Mesero a cargo de atender la Mesa. 
 * @return Devuelve un objeto de la clase Mesero que representa el Mesero a cargo de atender la Mesa.
 */
    public Mesero getMeseroACargo(){
        return meseroACargo;
    }

/**
 * Recibe como parámtro un objeto de la clase Mesero que representa el Mesero a cargo de atender la Mesa.
 * @param nuevo Objeto de la clase Mesero que representa el Mesero a cargo de atender la Mesa.
 */
    public void setMeseroACargo(Mesero nuevo){
        this.meseroACargo=nuevo;
    }

/**
 * Retorna un objeto de la clase Orden que representa la Orden asociada a la mesa que solicitó el cliente.
 * @return Devuelve un objeto de la clase Orden que representa la Orden asociada a la mesa que solicitó el cliente.
 */
    public Orden getOrdenMesa(){
        return ordenMesa;
    }

/**
 * Recibe como parámetro un objeto de la clase Orden que representa la Orden asociada a la mesa que solicitó el cliente.
 * @param nueva Objeto de la clase Orden que representa la Orden asociada a la mesa que solicitó el cliente.
 */
    public void setOrdenMesa(Orden nueva){
        this.ordenMesa=nueva;
    }

/**
 * Retorna un entero que representa las ventas totales de la Mesa.
 * @return Devuelve un entero que representa las ventas totales de la Mesa.
 */
    public int getVentasTotales(){
        return ventasTotales;
    }

/**
 * Recibe como parámetro un entero que representa la cantidad a sumar a las ventas totales de la Mesa.
 * @param aSumar Entero que representa la cantidad a sumar a las ventas totales de la Mesa.
 */
    public void setVentasTotales(int aSumar){
        this.ventasTotales+=aSumar;
    }

/**
 * Libera la mesa. Cambia los atributos necesarios para indicar que la mesa ahora está desocupada. 
 */
    public void liberarMesa(){
        this.ocupada=false;
        this.meseroACargo.setAtendiendo(false);
        this.meseroACargo=null;
        this.ordenMesa=null;
    }

/**
 * Imprime en pantalla la información general de la mesa.
 */
    public void verInfo(){
        System.out.println("-----> Mesa");
        System.out.println("Numero de mesa: "+this.getNumMesa());
        System.out.println("Ventas totales: $"+this.getVentasTotales());
        System.out.println("Ocupada: "+this.getOcupada());
        if(this.getOcupada()==true){
            System.out.println("Mesero a cargo: "+this.getMeseroACargo().getNombre());
            ordenMesa.mostrarInfo();
        }
    }



}
