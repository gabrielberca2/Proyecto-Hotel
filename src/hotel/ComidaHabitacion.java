
package hotel;
import javax.swing.JOptionPane;

public class ComidaHabitacion {
    int totalComida;
    int condicionCiclo;
    String condicionCompra;
    char menu;
    char refresco;
    char papas;
    char combo;
    char postre;   
    String factura;
    int cantComida;
    
    
    public void comprar(){
        
        
     
     
     condicionCompra=JOptionPane.showInputDialog(null,"Desea comprar comida para el día de su llegada? (si/no)");
     
     if(condicionCompra.equals("si")){
        

         do{
    menu=JOptionPane.showInputDialog(null,
           "Digite el numero del menu que desea comprar\n\n"
    +"1)Hamburguesa\n"
            + "2)Refresco\n"
            + "3)Ensalda\n"
            + "4)Papas\n"
            + "5)Almuerzo\n"       
            + "6)Postre").charAt(0);
             
   switch (menu){
       case'1':{
           cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de hamburguesas: "));
           totalComida= totalComida+(cantComida*2500);
           factura=factura+cantComida+"Hamburguesa(s) "+"\n";
           
       }
       
       case '2':{
           refresco=JOptionPane.showInputDialog(null,
           "Digite el numero de acuerdo al refresco que desea comprar\n\n"
    +"1)Coca Cola\n"
            + "2)Te frío\n"
            + "3)Fresco de frutas\n"
            + "4)Sprite").charAt(0);
           switch (refresco){
               case '1':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de coca cola: "));
                   totalComida=totalComida+(cantComida*1000);  
                    factura=factura+cantComida+"Coca Cola(s) "+"\n";
               }
               case '2':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de té fríos: "));
                    totalComida=totalComida+(cantComida*800);
                     factura=factura+cantComida+"Té frío(s) "+"\n";
               }
               case '3':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de fresco de frutas: "));
                    totalComida=totalComida+(cantComida*600);
                     factura=factura+cantComida+"Fresco de frutas(s) "+"\n";
               }
               case '4':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de sprites: "));
                    totalComida=totalComida+(cantComida*1000);
                     factura=factura+cantComida+"Sprite(s) "+"\n";
               }
           }
       }
       
       
       case '3':{
           cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de ensaldas: "));
            totalComida=totalComida+(cantComida*400);
             factura=factura+cantComida+"Ensalada(s) "+"\n";
       }
       
       case '4':{
            papas=JOptionPane.showInputDialog(null,
           "Digite el numero de acuerdo con el tamaño de papas que desea:\n\n"
    +"1)Pequeñas\n"
            + "2)Medianas\n"
            + "3)Grandes\n"
            + "4)Supremas").charAt(0);
             switch (refresco){
               case '1':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de papas pequeñas: "));
                   totalComida=totalComida+(cantComida*800);  
                   factura=factura+cantComida+"Papas pequeñas "+"\n";
               }
               case '2':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de papas medianas: "));
                    totalComida=totalComida+(cantComida*1200);
                    factura=factura+cantComida+"Papas medianas "+"\n";
               }
               case '3':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de grandes: "));
                    totalComida=totalComida+(cantComida*1500);
                    factura=factura+cantComida+"Papas grandes "+"\n";
               }
               case '4':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de papas supremas: "));
                    totalComida=totalComida+(cantComida*2000);
                    factura=factura+cantComida+"Papas supremas "+"\n";
               }
           }
       }
       
       case '5':{
           combo=JOptionPane.showInputDialog(null,
           "Digite el numero de acuerdo con el combo que desea:\n\n"
    +"1)Hamburguesa,papas medias y reresco\n"
            + "2)Casado y té frío\n"
            + "3)Tacos al pastor,papas medianas y fresco de frutas\n"
            + "4)Spaguetti y coca cola").charAt(0);
             switch (combo){
               case '1':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de combos: "));
                   totalComida=totalComida+(cantComida*800);      
                   factura=factura+cantComida+"Combo(s)1 "+"\n";
               }
               case '2':{
                    cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de combos: "));
                    totalComida=totalComida+(cantComida*1200);
                    factura=factura+cantComida+"Combo(s)2 "+"\n";
               }
               case '3':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de combos: "));
                    totalComida=totalComida+(cantComida*1500);
                    factura=factura+cantComida+"Combo(s)3 "+"\n";
               }
               case '4':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de combos: "));
                    totalComida=totalComida+(cantComida*2000);
                    factura=factura+cantComida+"Combo(s)4 "+"\n";
               }
           }
       }
       case '6':{
           postre=JOptionPane.showInputDialog(null,
           "Digite el numero de acuerdo con el postre desea:\n\n"
    +"1)Tres Leches\n"
            + "2)Brownie\n"
            + "3)Cheesecake\n"
            + "4)Helado con gelatina").charAt(0);
             switch (refresco){
               case '1':{
                    cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de postres: "));
                   totalComida=totalComida+(cantComida*800);     
                   factura=factura+cantComida+"Tres leche(s) "+"\n";
               }
               case '2':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de postres: "));
                    totalComida=totalComida+(cantComida*1200);
                    factura=factura+cantComida+"Brownie(s) "+"\n";
               }
               case '3':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de postres: "));
                    totalComida=totalComida+(cantComida*1500);
                    factura=factura+cantComida+"Cheesecake(s) "+"\n";
               }
               case '4':{
                   cantComida=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de postres: "));
                    totalComida=totalComida+(cantComida*2000);
                    factura=factura+cantComida+"Helado(s) con gelatina "+"\n";
               }
           }
       }
       
       
   }          
    
    
    
    
    condicionCiclo=Integer.parseInt(JOptionPane.showInputDialog(null,"Desea pedir algo más?(1)si/(0)no"));
}while(condicionCiclo==1);
      JOptionPane.showMessageDialog(null,"Su factura es: "+factura+"\n"
    +"Con un total a pagar de: "+totalComida);
}   
     }
    }
   
 
