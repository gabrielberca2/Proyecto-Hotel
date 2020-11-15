
package hotel;
import javax.swing.JOptionPane;

public class Huesped {
    
    private String nombre;
    private int edad;
    private String cedula;
    private String residencia;

    public Huesped(String nombre, int edad, String cedula, String residencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.residencia = residencia;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
   
//    public void leerInformacionClientes () {
//  
//  
//     this.condicional="";
//  
//         
//    cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Bienvenidos a Hotel Villa Paraiso. Ingrese la cantidad de miembros que desean hospedar: "));
//  
//  
//    int cant [] = new int [cantidad];
//    int x;
//    
//    for ( x=0;x<cant.length;x++){
//        nombre= JOptionPane.showInputDialog(null,"Ingrese su nombre completo:");
//        cedula=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su numero de cedula: "));
//        edad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad: "));
//        residencia=JOptionPane.showInputDialog(null,"Ingrese su residencia: ");
//        
//        informacion= informacion + "Nombre: "+ nombre + ", Cédula: "+ cedula + ", Edad: "+ edad  +" años, Residencia: "+ residencia + "\n";
//        impresion= informacion+ " ";
//        
//    }
//        


           
    
}
//    
//    public void impresionInformacionCliente(){
//        JOptionPane.showMessageDialog(null,"A continuación se le demostrara la informacion de los huepedes de la siguiente manera: "+
//                "\n"
//                + impresion);
//        
//        
//    }
//    
//    
//    public String getCondicional() {
//        return condicional;
//    }
//
//    public void setCondicional(String condicional) {
//        this.condicional = condicional;
//    }
//
//    public int getCantidad() {
//        return cantidad;
//    }
//
//    public void setCantidad(int cantidad) {
//        this.cantidad = cantidad;
//    }

 
    
    
    
        
    
    
    

