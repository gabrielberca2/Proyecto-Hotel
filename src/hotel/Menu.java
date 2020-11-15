package hotel;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Menu {

//    public static void menu() {
//        String opcion;
//        String codigoOpcion;
//
//    }
//    
    
    
    private HotelManager _hotelManager;

    public Menu() {
        this._hotelManager = new HotelManager();
    }
    
    
    
    public void mostrarOpciones() 
    {
        int opcion = 0;
        do 
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.Reservas"
                    + "\n 2.Cancelar reservas"
                    + "\n 3.Mostar reservas"));
            switch (opcion) {
                case 1: {


                     String sfechaIngreso = JOptionPane.showInputDialog(null,"Ingrese la fecha de ingreso de la reservacion: ");
                     String sfechaSalida = JOptionPane.showInputDialog(null,"Ingrese la fecha de salida de la reservacion: ");
                     Integer numeroHuespedes = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de huespedes: "));
                     Integer numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de habitacion [1-115]: "));


                     LocalDate fechaIngreso = LocalDate.parse(sfechaIngreso);
                     LocalDate fechaSalida = LocalDate.parse(sfechaSalida);

                     Reservacion nuevaReservacion = new Reservacion(fechaIngreso, fechaSalida, numeroHabitacion, numeroHuespedes);

                     
                     for(int i =0;i<numeroHuespedes;i++)
                     {
                        String nombre= JOptionPane.showInputDialog(null,"Ingrese su nombre completo:");
                        String cedula = JOptionPane.showInputDialog(null,"Ingrese su numero de cedula: ");
                        Integer edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad: "));
                        String residencia = JOptionPane.showInputDialog(null,"Ingrese su residencia: ");

                        Huesped nuevoHuespued = new Huesped(nombre, edad, cedula, residencia);
                        
                        nuevaReservacion.AgregarHuesped(nuevoHuespued);
                     }
                     
                                          
                     _hotelManager.AgregarReservacion(nuevaReservacion);
                 
                     break;
                }
                
                case 2: {
                    Integer numeroHabitacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de habitacion reservada [1-115]: "));

                    Reservacion reservacionAEliminar = _hotelManager.BuscarReservacion(numeroHabitacion);
                    
                    _hotelManager.EliminarReservacion(reservacionAEliminar);
                 
                    break;
                }
                
                case 3: {
                                               
                    String informacion = "";
                    for(int i=0;i<=_hotelManager.getIndexReservacion();i++)
                    {                        
                        Reservacion reservacionActual = _hotelManager.BuscarReservacion(i);
                        informacion += reservacionActual.getInformacion();
                        informacion += "\n";                                               
                    }
                
                   JOptionPane.showMessageDialog(null,"RESERVACIONES: " + informacion);
                   
                   break;
                }
            }        
        }while (opcion != 0);
    }
    
   

//
//    public static void mostrarOpciones() {
//        int opcion = 0;
//        do {
//            opcion = Integer.parseInt(JOptionPane.showInputDialog(""
//                    + "1.Reservas"
//                    + "\n 2.Cancelar reservas"
//                    + "\n 3.Mostar reservas"));
//            switch (opcion) {
//                case 1: {
//                    // llamar reservas
//                    
//        Identificacion uno=new Identificacion(); 
//        ReservaDia primera=new ReservaDia();
//        reservaHabitacion habitacion=new reservaHabitacion();
//        TiempoAlojamiento dia=new TiempoAlojamiento();
//        ComidaHabitacion comida = new ComidaHabitacion();
//        ReservacionPiscina piscina = new ReservacionPiscina();
//        
//        
//        uno.leerInformacionClientes();
//        uno.impresionInformacionCliente();       
//        
//        uno.setCondicional(JOptionPane.showInputDialog(null,"¿La información es correcta?(Ingrese si/no)"));
//        
//        if (uno.getCondicional() == "no") {
//            uno.leerInformacionClientes();
//            uno.impresionInformacionCliente();   
//        }
//      
//        primera.resetearDia();
//        primera.reservaDia();
//            
//        habitacion.resetearHabitaciones();
//        habitacion.reservaHabit();
//        
//        dia.diasAlojados();
//        
//        comida.comprar();
//        
//        piscina.resetearDia();
//        piscina.reservaPiscina();
//                    break;
//                }
//                case 2: {
//
//                    //cancelar reservas
//                    break;
//                }
//                   case 3: {
//
//                    // mostrar resevas
//                    
//                    break;
//                }
//                    
//
//                }
//            
//                
//
//            }
//            while (opcion != 0);
//        } //  public static void setOpciones(){ 
//        // }


    }
