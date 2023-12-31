
package arreglosenjavaextras02;

import java.util.Scanner;

public class ArreglosEnJAVAEXTRAS02 {

  
    public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los vectores: ");
        int N = scanner.nextInt();

        int[] vector1 = new int[N];
        int[] vector2 = new int[N];

        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < N; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }

        scanner.close();

        boolean sonIguales = verificarVectoresIguales(vector1, vector2);

        if (sonIguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
    }

    public static boolean verificarVectoresIguales(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            return false;
        }

        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }

        return true;
    }
    }
    

