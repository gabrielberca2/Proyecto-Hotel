
package hotel;

/**
 *
 * @author edmon
 */
public class HotelManager {
    
    private Reservacion[] Reservaciones;
    private int indexReservacion; 
    private int MAXHABITACIONES;
    
    
    public HotelManager()
    {
        MAXHABITACIONES = 115;
        Reservaciones = new Reservacion[MAXHABITACIONES];
        indexReservacion = 0;
    }
    
    
    public Reservacion BuscarReservacion(int numeroHabitacion)
    {
        for (int i=0;i<indexReservacion;i++)
        {
            if (Reservaciones[i].getNumeroHabitacion() == numeroHabitacion)
            {
                return Reservaciones[i];
            }            
        }
        return null;
    }

    public int getIndexReservacion() {
        return indexReservacion;
    }
    
    public boolean ValidarDisponibilidadHabitacion(Reservacion nuevaReservacion)
    {        
        for (int i=0;i<indexReservacion;i++)
        {                    
            if (Reservaciones[i].getNumeroHabitacion() == nuevaReservacion.getNumeroHabitacion())
            {
                return false;
            }            
        }
        
        return true;
    }
        
    public void AgregarReservacion(Reservacion nuevaReservacion)
    {                       
        Reservaciones[indexReservacion] = nuevaReservacion;
        indexReservacion++;
    }
    
    
    public void EliminarReservacion(Reservacion reservacionEliminar)
    {
        Reservacion[] reservacionesTemp = new Reservacion[MAXHABITACIONES];;
        
        Reservacion r;
        
        for (int i=0;i<indexReservacion;i++)
        {
            if (Reservaciones[i].getNumeroHabitacion() != reservacionEliminar.getNumeroHabitacion())
            {
                reservacionesTemp[i] = Reservaciones[i];
            }
            //Si la habitacion coincide con la reservacion, entonces no la agrega al arreglo.
        }
        

        Reservaciones = reservacionesTemp;
        indexReservacion--;
    }
    
    
}
