import java.util.Scanner;
public class RETO1 {
    public static void main(String[] args) {
        double gradosk=0;
        double gradosC=0; 
        try (Scanner leer = new Scanner (System.in)){

        System.out.println("Ingrese la temperatura kelvin: ");
        gradosk = leer.nextDouble();
        gradosC = (gradosk - 273);
        System.out.println("En grados centigrados es: "+ gradosC);
        }
    }   
}