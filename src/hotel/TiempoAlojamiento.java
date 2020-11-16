//ERROR
package hotel;
import javax.swing.JOptionPane;

public class TiempoAlojamiento extends Identificacion {
   int dias;
   float descuento;
   float total;
   float totalSinDesc;
   
   
   public void diasAlojados(){
       dias=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de días que se desea hospedar: (si son más de 3 días se le hace un decuento del 10%)"));
       if (dias>3){
           totalSinDesc=getCantidad()*90000;
           descuento=(totalSinDesc/100)*10;
           total=totalSinDesc-descuento;
           JOptionPane.showMessageDialog(null,"El total a pagar es de 90 000 por persona para un total de: "
                   + "\n"+totalSinDesc
           +"\nCon un descuento de: "+descuento
           +"\nPara un total de: "+total
           +"\nCon una cantidad de: "+getCantidad()+" personas");
           
       }
       else{
           totalSinDesc=getCantidad()*90000;
           JOptionPane.showMessageDialog(null,"El total a pagar es de 90 000 por persona para un total de: "+totalSinDesc
           +"\nCon una cantidad de: "+getCantidad()+" personas");
       }
   }
    
    
    
}
