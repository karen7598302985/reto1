import java.util.Scanner;
public class reto7 {
    public static void main (String[]args){
        String nombre;
        int dineroapostar;
        int eleccion=1;
        
    Scanner leer=new Scanner(System.in);
    while(eleccion==1){
    System.out.println("Ingresa tu nombre:");
    nombre=leer.next();
    System.out.println("Ingresa la cantidad de dinero que va a apostar:");
    dineroapostar=leer.nextInt();
    
    if (dineroapostar>10000){
        System.out.println("Ingresa 1. si deseas escoger piedra,  2. si deseas escoger papel y 3. si deseas escoger tijeras");
    eleccion=leer.nextInt();
if(eleccion==1){
    System.out.println("yo elijo papel");
    System.out.println("tu pierdes");
}
else if (eleccion==2){
        System.out.println("yo elijo tijera");
        System.out.println("tu pierdes");
    }
else if (eleccion==3){
        System.out.println("yo elijo piedra");
        System.out.println("tu pierdes");
    
    }  
}

else{
    System.out.println("debe digitar un valor mayor a 10000");
}
System.out.println("Ingresa 1. si deseas jugar nuevamente y 2. si no quieres jugar mas");
    eleccion=leer.nextInt();
}
    
System.out.println("gracias por utilizar nuestro programa");
leer.close();

    }
}

