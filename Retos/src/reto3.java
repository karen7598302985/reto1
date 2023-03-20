import java.util.Scanner;
public class reto3 {
    public static void main (String[]args){
        String nombre;
        int dineroapostar;
        int eleccion;
        
    Scanner leer=new Scanner(System.in);
    System.out.println("Ingresa tu nombre:");
    nombre=leer.nextLine();
    System.out.println("Ingresa la cantidad de dinero que va a apostar:");
    dineroapostar=leer.nextInt();
    
    if (dineroapostar>10000){
        System.out.println("Ingresa 1. si deseas escoger cara y 2. si deseas escoger sello");
    eleccion=leer.nextInt();
if(eleccion==1)
    System.out.println("la moneda cayo en sello por ende pierdes");
 else
        System.out.println("la moneda cayo en cara por ende pierdes");
   
   
}
else{
    System.out.println("debe digitar un valor mayor a 10000");
}
      

leer.close();

    }
}
