
import java.util.Scanner;
public class des6_2 {
    public static void adiv()  {
            Scanner sc = new Scanner(System.in);
            int numeroAleatorio = (int) (Math.random() * 5) + 1;
            int intentos = 0;
            int numeroUsuario = 0;
            System.out.println("Adivina el número entre 1 y 5");
            do {
                System.out.print("Ingresa tu intento: ");
                numeroUsuario = sc.nextInt();
                intentos++;
                if (numeroUsuario < numeroAleatorio) {
                    System.out.println("El número correcto es mayor.");
                } else if (numeroUsuario > numeroAleatorio) {
                    System.out.println("El número correcto es menor.");
                }
            } while (numeroUsuario != numeroAleatorio);
            System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
        }
}
