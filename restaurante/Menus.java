package restaurante;
import java.util.Scanner;

import restaurante.personas.Administrador;
import restaurante.personas.Mesero;
import restaurante.platillos.ChileNogada;
import restaurante.platillos.Mole;
import restaurante.platillos.Pozole;
import restaurante.platillos.QuesoRelleno;
import restaurante.platillos.Tamal;

import java.util.ArrayList;
import java.util.Set;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Menus es una clase que contiene los métodos que muestran el menú de administrador y el menú de mesero.
 * @author Equipo 10 POO
 */
public class Menus {
/**
 * Imprime en pantalla el menú para el Administrador, ejecuta algún método dependiendo de la opción seleccionada. De igual manera es aquí donde guardamos la información actualizada de todos los participantes del Restaurante una vez que el usuario decida salir.  
 * @param arrMeseros ArrayList que contiene todas los meseros del restaurante.
 * @param arrAdmin ArrayList que contiene a los administradores registrados.
 * @param arrMesas ArrayList que contiene todas las mesas del restaurante.
 * @param mesasR Set que contiene todas las mesas del restaurante.
 * @param disponibles Set que contiene todas las mesas disponibles del restaurante.
 * @param ocupadas Set que contiene todas las mesas ocupadas del restaurante. 
 * @param meserosR ArrayList que contiene todas los meseros del restaurante.
 * @param MeserosD ArrayList que contiene todas los meseros disponibles del restaurante.
 * @param MeserosO ArrayList que contiene todas los meseros ocupados del restaurante.
 * @param arrVentasP ArrayList que contiene las ventas totales de cada platillo.
 */
    public static void MenuA(ArrayList<Mesero> arrMeseros, ArrayList<Administrador> arrAdmin, ArrayList<Mesa> arrMesas,Set<Mesa> mesasR, Set<Mesa> disponibles, Set<Mesa> ocupadas, ArrayList<Mesero> meserosR , ArrayList<Mesero> MeserosD, ArrayList<Mesero> MeserosO, ArrayList<Integer> arrVentasP){
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("\n--------- Selecciona una opcion ---------");
            System.out.println("1) Registrar persona");
            System.out.println("2) Ver personas registradas");
            System.out.println("3) Ver ventas totales de cada mesero");
            System.out.println("4) Ver ventas totales de cada mesa");
            System.out.println("5) Modificar perfil mesero");
            System.out.println("6) Ver estadisticas");
            System.out.println("7) Salir y guardar cambios");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.println("\nQue tipo de persona quieres registrar?");
                    System.out.println("1) Administrador");
                    System.out.println("2) Mesero");
                    int num=sc.nextInt();

                    if(num==1){
                        Administrador admin = new Administrador();
                        admin = Metodos.registrarA();
                        if(admin.getTelefono()!=0){
                            arrAdmin.add(admin);
                        }

                    }else if(num==2){
                        Mesero mesero = new Mesero();
                        mesero = Metodos.registrarM();
                        if(mesero.getTelefono()!=0){
                            arrMeseros.add(mesero);
                        }
                    
                    }else{
                        System.out.println("\nOpcion no valida");
                    }

                    break;

                case 2:
                    System.out.println("\n-------------- Administradores --------------");
                    Metodos.mostrarAR(arrAdmin);
                    System.out.println("\n------------------ Meseros ------------------");
                    Metodos.mostrarMR(arrMeseros);
                    break;

                case 3:
                    System.out.println("\n------------- Ventas de Meseros -------------");
                    Metodos.mostrarVentasM(arrMeseros);
                    break;

                case 4:
                    System.out.println("\n-------------- Ventas de Mesas --------------");
                    Metodos.mostrarVentasMesas(arrMesas);
                    break;

                case 5:
                    Metodos.modificarMesero(arrMeseros);
                    break;

                case 6:
                    System.out.println("\n---------------- Estadisticas ----------------");
                    Metodos.verEstadisticas(arrVentasP, arrMeseros);
                    break;

                case 7:
                    try {
                        FileOutputStream f = new FileOutputStream("restaurante/data/dataAdmin.ser");
                        ObjectOutputStream s = new ObjectOutputStream(f);
                        s.writeObject(arrAdmin);
                       
                        s.close();

                        FileOutputStream f2 = new FileOutputStream("restaurante/data/dataMesero.ser");
                        ObjectOutputStream s2 = new ObjectOutputStream(f2);
                        s2.writeObject(arrMeseros);
                       
                        s2.close();

                        FileOutputStream f3 = new FileOutputStream("restaurante/data/dataMesa.ser");
                        ObjectOutputStream s3 = new ObjectOutputStream(f3);
                        s3.writeObject(arrMesas);
                       
                        s3.close();


                        if(arrVentasP.size()!=0){
                            arrVentasP.clear();
                            arrVentasP.add(ChileNogada.getVentas());
                            arrVentasP.add(Mole.getVentas());
                            arrVentasP.add(Pozole.getVentas());
                            arrVentasP.add(QuesoRelleno.getVentas());
                            arrVentasP.add(Tamal.getVentas());
                        }else{
                            arrVentasP.add(ChileNogada.getVentas());
                            arrVentasP.add(Mole.getVentas());
                            arrVentasP.add(Pozole.getVentas());
                            arrVentasP.add(QuesoRelleno.getVentas());
                            arrVentasP.add(Tamal.getVentas());
                        }

                        FileOutputStream f4 = new FileOutputStream("restaurante/data/dataPlatillo.ser");
                        ObjectOutputStream s4 = new ObjectOutputStream(f4);
                        s4.writeObject(arrVentasP);
                       
                        s4.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;

                default:
                    System.out.println("\nOpcion no valida");
            }

        }while(opc!=7);
    }

/**
 * Imprime en pantalla el menú para el Mesero, ejecuta algún método dependiendo de la opción seleccionada. De igual manera es aquí donde guardamos la información actualizada de todos los participantes del Restaurante una vez que el usuario decida salir.  
 * @param arrMeseros ArrayList que contiene todas los meseros del restaurante.
 * @param arrAdmin ArrayList que contiene a los administradores registrados.
 * @param arrMesas ArrayList que contiene todas las mesas del restaurante.
 * @param mesasR Set que contiene todas las mesas del restaurante.
 * @param disponibles Set que contiene todas las mesas disponibles del restaurante.
 * @param ocupadas Set que contiene todas las mesas ocupadas del restaurante. 
 * @param meserosR ArrayList que contiene todas los meseros del restaurante.
 * @param MeserosD ArrayList que contiene todas los meseros disponibles del restaurante.
 * @param MeserosO ArrayList que contiene todas los meseros ocupados del restaurante.
 * @param arrVentasP ArrayList que contiene las ventas totales de cada platillo.
 */
    public static void MenuM(ArrayList<Mesero> arrMeseros, ArrayList<Administrador> arrAdmin, ArrayList<Mesa> arrMesas,Set<Mesa> mesasR, Set<Mesa> disponibles, Set<Mesa> ocupadas, ArrayList<Mesero> meserosR, ArrayList<Mesero> MeserosD, ArrayList<Mesero> MeserosO, ArrayList<Integer> arrVentasP ){
        Scanner sc = new Scanner(System.in);
        int opc=0;
        do{
            System.out.println("\n------------ Selecciona una opcion ------------");
            System.out.println("1) Ver personas registradas");
            System.out.println("2) Crear Orden");
            System.out.println("3) Ver mesas disponibles");
            System.out.println("4) Ver mesas ocupadas");
            System.out.println("5) Ver todas las mesas");
            System.out.println("6) Liberar mesa");
            System.out.println("7) Salir");
            opc = sc.nextInt();

            switch(opc){
                case 1:
                    System.out.println("\n-------------- Administradores --------------");
                    Metodos.mostrarAR(arrAdmin);
                    System.out.println("\n------------------ Meseros ------------------");
                    Metodos.mostrarMR(arrMeseros);
                    break;

                case 2:
                    Metodos.crearOrden(arrMesas, arrMeseros, mesasR, disponibles, ocupadas, meserosR, MeserosD, MeserosO);
                    break;

                case 3:
                    System.out.println("\n-------------- Mesas disponibles --------------");
                    Metodos.mostrarMesasD(mesasR, disponibles, ocupadas);
                    break;

                case 4:
                    System.out.println("\n---------------- Mesas ocupadas ----------------");
                    Metodos.mostrarMesasO(ocupadas);
                    break;
                
                case 5:
                    System.out.println("\n--------------------- Mesas ---------------------");
                    Metodos.mostrarMesas(arrMesas);
                    break;

                case 6:
                    Metodos.liberarMesa(arrMesas,mesasR, ocupadas, MeserosO);
                    break;

                case 7:
                    if(ocupadas.size()>0){
                        opc=100;
                        System.out.println("\nPara poder salir se tienen que liberar todas las mesas");
                    }else{
                        try {
                            FileOutputStream f = new FileOutputStream("restaurante/data/dataAdmin.ser");
                            ObjectOutputStream s = new ObjectOutputStream(f);
                            s.writeObject(arrAdmin);
                           
                            s.close();
    
                            FileOutputStream f2 = new FileOutputStream("restaurante/data/dataMesero.ser");
                            ObjectOutputStream s2 = new ObjectOutputStream(f2);
                            s2.writeObject(arrMeseros);
                           
                            s2.close();
    
                            FileOutputStream f3 = new FileOutputStream("restaurante/data/dataMesa.ser");
                            ObjectOutputStream s3 = new ObjectOutputStream(f3);
                            s3.writeObject(arrMesas);
                           
                            s3.close();
    
                            if(arrVentasP.size()!=0){
                                arrVentasP.clear();
                                arrVentasP.add(ChileNogada.getVentas());
                                arrVentasP.add(Mole.getVentas());
                                arrVentasP.add(Pozole.getVentas());
                                arrVentasP.add(QuesoRelleno.getVentas());
                                arrVentasP.add(Tamal.getVentas());
                            }else{
                                arrVentasP.add(ChileNogada.getVentas());
                                arrVentasP.add(Mole.getVentas());
                                arrVentasP.add(Pozole.getVentas());
                                arrVentasP.add(QuesoRelleno.getVentas());
                                arrVentasP.add(Tamal.getVentas());
                            }
    
                            FileOutputStream f4 = new FileOutputStream("restaurante/data/dataPlatillo.ser");
                            ObjectOutputStream s4 = new ObjectOutputStream(f4);
                            s4.writeObject(arrVentasP);
                           
                            s4.close();
    
                            
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    
                    break;

                default:
                    System.out.println("\nOpcion no valida");
            }

        }while(opc!=7);
    }
}
