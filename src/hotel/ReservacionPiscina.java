
package hotel;

import javax.swing.JOptionPane;


public class ReservacionPiscina {
    
    
      
    int reservaPiscina;
    String condicion;
    int contraseña;
    String nosi;

    private int reserva []=new int [30];
    
    public void resetearDia(){
        int x;
        contraseña=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la conreaseña para acceder al registro: (si es un cliente escriba 0)"));
        if (contraseña==12345){
            condicion=JOptionPane.showInputDialog(null,"Desea resetear la lista de reservas de la piscina?(si/no)");
            if (condicion.equals ("si")){
                for (x=0;x<reserva.length;x++){
                 reserva[x]=0;
            }
                              
        }
        
       
        }
    }
    
    
    
    public void reservaPiscina(){
        
        
       do{               
        reservaPiscina=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día del 1ero al 30, que desea reservar la piscina: "));
        
        
        if (reserva[reservaPiscina]==0){
            reserva[reservaPiscina]= 1 ;
            JOptionPane.showMessageDialog(null,"Usted ha reservado el día: "+reservaPiscina);
            nosi="si";
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dia esta ocupado, ingrese otro: ");
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
    
    
}
}
