/**
 * Paquete que contiene las clases de cada Persona que trabaja en el Restaurante.
 */
package restaurante.personas;
import java.io.Serializable;
import restaurante.excepciones.*;

/**
 * Persona es una clase abstracta que implementa la interfaz Serializable para que las clases que hereden de esta puedan ser guardadas en un archivo de objetos.
 * @author Equipo 10 POO
 */
public abstract class Persona implements Serializable{
    private String userName;
    private String passW;
    private String nombre;
    private int edad;
    private String sexo;
    private long telefono;

/**
 * Recibe un String que representa el nombre de usuario de la Persona.
 * @param nuevo String que representa el nombre de usuario de la Persona.
 * @throws UserNameException Genera excepción UserNameException cuando el formato del nombre de usuario no es el correcto. 
 */
    public void setUserName(String nuevo) throws UserNameException{
        if(nuevo.length()<4){
            throw new UserNameException();
        }else{
            for(int i=0; i<nuevo.length();i++){
                if(nuevo.charAt(i)!=Character.toLowerCase(nuevo.charAt(i))){
                    throw new UserNameException();
                }
            }
            this.userName=nuevo;
        }
    }

/**
 * Retorna un String que representa el nombre de usuario de la Persona.
 * @return Devuelve un String que representa el nombre de usuario de la Persona.
 */
    public String getUserName(){
        return this.userName;
    }

/**
 * Recibe un String que representa la contraseña de la Persona.
 * @param pass String que representa la contraseña de la Persona.
 * @throws PasswordException Genera excepción PasswordException cuando el formato de la contraseña no es el correcto. 
 */
    public void setPassW( String pass) throws PasswordException{
        if(pass.length()<4){
            throw new PasswordException();
        }else{
            this.passW = pass;
        }
    }

/**
 * Retorna un String que representa la contraseña de la Persona.
 * @return Devuelve un String que representa la contraseña de la Persona.
 */
    public String getPassW(){
        return this.passW;
    }

/**
 * Retorna un String que representa el nombre de la Persona.
 * @return Devuelve un String que representa el nombre de la Persona.
 */
    public String getNombre(){
        return this.nombre;
    }

/**
 * Recibe un String que representa el nombre de la Persona.
 * @param nuevo String que representa el nombre de la Persona.
 * @throws NombreException Genera excepción NombreException cuando el formato del nombre no es el correcto. 
 */
    public void setNombre(String nuevo) throws NombreException{
        char[] chars = nuevo.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                throw new NombreException();
            }
        }
        if(nuevo.charAt(0)!=Character.toUpperCase(nuevo.charAt(0))){
            throw new NombreException();
        }else{
            this.nombre=nuevo;
        }
    }

/**
 * Retorna un entero que representa la edad de la Persona.
 * @return Devuelve un entero que representa la edad de la Persona.
 */
    public int getEdad(){
        return this.edad;
    }

/**
 * Recibe un String que representa la edad de la Persona.
 * @param nueva String que representa la edad de la Persona.
 * @throws EdadException Genera excepción EdadException cuando el formato de la edad no es el correcto. 
 */
    public void setEdad(String nueva) throws EdadException{
        int number;
        try {
            number = Integer.parseInt(nueva);
            if(number==0 || number>=100){
                throw new EdadException();
            }else{
                this.edad=number;
            }
        } catch (NumberFormatException e) {
            throw new EdadException();
        }
    }

/**
 * Retorna un String que representa el sexo de la Persona.
 * @return Devuelve un String que representa el sexo de la Persona.
 */
    public String getSexo(){
        return this.sexo;
    }

/**
 * Recibe un String que representa el sexo de la Persona.
 * @param nuevo String que representa el sexo de la Persona.
 * @throws SexoException Genera excepción SexoException cuando el formato del sexo no es el correcto. 
 */
    public void setSexo(String nuevo) throws SexoException{
        if(nuevo.length()!=1){
            throw new SexoException();
        }else if(nuevo.charAt(0)!=Character.toUpperCase(nuevo.charAt(0))){
            throw new SexoException();
        }else if(nuevo.charAt(0) == 'M' || nuevo.charAt(0) == 'F'){
            this.sexo=nuevo;
        }else{
            throw new SexoException();
        }
        
    }

/**
 * Retorna un long que representa el teléfono de la Persona.
 * @return Devuelve un long que representa el teléfono de la Persona.
 */
    public long getTelefono(){
        return this.telefono;
    }

/**
 * Recibe un String que representa el teléfono de la Persona.
 * @param nuevo String que representa el teléfono de la Persona.
 * @throws TelefonoException Genera excepción TelefonoException cuando el formato del teléfono no es el correcto. 
 */
    public void setTelefono(String nuevo) throws TelefonoException{
        long number;
        try {
            if(nuevo.length()!=10){
                throw new TelefonoException();
            }else{
                number = Long.parseLong(nuevo);
                this.telefono=number;
            }
        } catch (NumberFormatException e) {
            throw new TelefonoException();
        }
    }

/**
 * Crea una Persona
 */
    public Persona(){

    }

/**
 * Crea una Persona recibiendo como parámetro cada uno de sus datos. 
 * @param userName String que representa el nombre de usuario de la Persona.
 * @param passW String que representa la contraseña de la Persona.
 * @param nombre String que representa el nombre de la Persona.
 * @param edad Entero que representa la edad de la Persona.
 * @param sexo String que representa el sexo de la Persona.
 * @param telefono Long que representa el teléfono de la Persona.
 */
    public Persona(String userName, String passW,String nombre, int edad, String sexo, long telefono){
        this.userName = userName;
        this.passW = passW;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
    }

    /**
     * Método abstracto para establecer como regla que las clases que hereden de Persona implementen este método. 
     */
    public abstract void mostrarInfo();
}
