import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidadProductos;
        double precioProducto, sumaTotal = 0;
        
        System.out.print("Ingrese la cantidad de productos: ");
        cantidadProductos = leer.nextInt();
        
        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el precio del producto " + i + ": ");
            precioProducto = leer.nextDouble();
            sumaTotal += precioProducto;
        }
        
        System.out.println("La cantidad a pagar es: " + sumaTotal);
        leer.close();
    }
}