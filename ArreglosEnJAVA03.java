
package arreglosenjava03;

import java.util.Scanner;


public class ArreglosEnJAVA03 {

  
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector (N): ");
        int N = sc.nextInt();

        int[] vector = new int[N];

        System.out.println("Ingrese los elementos del vector:");

        for (int i = 0; i < N; i++) {
            vector[i] = sc.nextInt();
        }

        int[] contadores = new int[6]; // Usamos un arreglo de tamaño 6 para contar los números de 0 a 5 dígitos

        for (int num : vector) {
            int cantidadDigitos = contarDigitos(num);

            if (cantidadDigitos >= 1 && cantidadDigitos <= 5) {
                contadores[cantidadDigitos]++;
            }
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números con " + i + " dígito(s): " + contadores[i]);
        }

        sc.close();
    }

    // Función para contar la cantidad de dígitos de un número
    private static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }

        int contador = 0;
        while (numero != 0) {
            contador++;
            numero /= 10;
        }

        return contador;
    
}
}
