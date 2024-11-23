

import java.util.Scanner;
public class des6_1 {
    public static void calcPrecio() {
        Scanner sc = new Scanner(System.in);
        // Solicitamos al usuario que ingrese la distancia de ida y el tiempo de estancia
        System.out.print("Ingrese la distancia total de ida en km: ");
        int distanciaIda = sc.nextInt();
        System.out.print("Ingrese el número de días de estancia: ");
        int diasEstancia = sc.nextInt();
        // Definimos el precio por km y el descuento
        double precioPorKm = 3.70;
        double descuento = 0;
        // Calculamos el precio del billete
        double precioBillete = distanciaIda * 2 * precioPorKm;
        // Aplicamos descuento si corresponde
        if (diasEstancia > 7 && distanciaIda * 2 > 800) {
            descuento = 0.30 * precioBillete;
        }
        // Calculamos el precio final a abonar
        double precioFinal = precioBillete - descuento;
        // Mostramos el resultado en pantalla
        System.out.println("El precio a abonar por el billete de ida y vuelta en tren es: $" + precioFinal);
    }
}
