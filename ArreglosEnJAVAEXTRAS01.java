
package arreglosenjavaextras01;

import java.util.Scanner;


public class ArreglosEnJAVAEXTRAS01 {

   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        int N = scanner.nextInt();

        int[] vector = new int[N];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        scanner.close();

        int suma = calcularSumaVector(vector);

        System.out.println("La suma de los elementos del vector es: " + suma);
    }

    public static int calcularSumaVector(int[] vector) {
        int suma = 0;
        for (int elemento : vector) {
            suma += elemento;
        }
        return suma;
    }
    }
    

