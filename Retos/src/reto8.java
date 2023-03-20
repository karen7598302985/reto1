import java.util.Scanner;
import java.util.Random;

public class reto8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; 
        int intentos = 0;
        int numeroUsuario;

        System.out.println("Bienvenido al juego de adivinar el número");
        System.out.println("Tienes 10 intentos para adivinar el número secreto.");

        while (intentos < 10) {
            System.out.print("Intento #" + (intentos + 1) + ": Ingresa un número entre 1 y 100: ");
            numeroUsuario = input.nextInt();

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("¡Felicidades! Adivinaste el número secreto en " + (intentos + 1) + " intentos.");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número secreto es mayor que " + numeroUsuario + ".");
            } else {
                System.out.println("El número secreto es menor que " + numeroUsuario + ".");
            }

            intentos++;
        }

        if (intentos == 10) {
            System.out.println("Lo siento, no lograste adivinar el número secreto en 10 intentos.");
            System.out.println("El número secreto era " + numeroAleatorio + ".");
        }

        input.close();
    }
}