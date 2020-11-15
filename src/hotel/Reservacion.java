/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.time.LocalDate;
/**
 *
 * @author edmon
 */
public class Reservacion {
    
    
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private int numeroHabitacion;
    private Huesped[] Huespedes;
    private int indexHuesped;
    
    public Reservacion(LocalDate fechaIngreso, LocalDate fechaSalida, int numeroHabitacion, int numeroHuespedes) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
        Huespedes = new Huesped[numeroHuespedes];
        indexHuesped = 0;
    }
    

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    
    
    public void Reservar(LocalDate fechaIngreso, LocalDate fechaSalida, int numeroHabitacion) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
    }
    
    public void AgregarHuesped(Huesped huesped)
    {
        Huespedes[indexHuesped] = huesped;
        indexHuesped++;
    }
    
    
    public String getInformacion()
    {
        return "Fecha de ingreso: " + fechaIngreso.toString() + " - Fecha de salida: " + fechaSalida.toString() + " - Numero de habitacion: " + numeroHabitacion;
    }
        
}
