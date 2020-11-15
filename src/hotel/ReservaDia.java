
package hotel;
import javax.swing.JOptionPane;

public class ReservaDia {
    
    
      
    int reservaDia;
    String condicion;
    int contraseña;
    String nosi;

    private int reserva []=new int [30];
    
    public void resetearDia(){
        int x;
        contraseña=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la conreaseña para acceder al registro: (si es un cliente escriba 0)"));
        if (contraseña==12345){
            condicion=JOptionPane.showInputDialog(null,"Desea resetear la lista de reservas?(si/no)");
            if (condicion=="si"){
                for (x=0;x<reserva.length;x++){
                 reserva[x]=0;
            }
                              
        }
        
       
        }
    }
    
    
    
    public void reservaDia(){
        
        
       do{               
        reservaDia=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el día del 1ero al 30, que desea reservar: "));
        
        
        if (reserva[reservaDia]==0){
            reserva[reservaDia]= 1 ;
            JOptionPane.showMessageDialog(null,"Usted ha reservado el día: "+reservaDia);
            nosi="si";
        }
        else {
            JOptionPane.showMessageDialog(null,"Este dia esta ocupado, ingrese otro: ");
            nosi="no";
        }
        
        
    } while(nosi=="no");
    
    
    
    
}
}

