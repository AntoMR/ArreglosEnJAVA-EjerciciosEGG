
package arreglosenjavaextras05;

import java.util.Random;


public class ArreglosEnJAVAEXTRAS05 {

    
    public static void main(String[] args) {
     
         int N = 3; // Tamaño de filas
        int M = 4; // Tamaño de columnas

        int[][] matriz = new int[N][M];

        // Llenar la matriz con valores aleatorios
        llenarMatrizAleatoria(matriz);

        // Mostrar la matriz
        System.out.println("Matriz generada:");
        mostrarMatriz(matriz);

        // Calcular y mostrar la suma de los elementos de la matriz
        int suma = calcularSumaMatriz(matriz);
        System.out.println("\nLa suma de los elementos de la matriz es: " + suma);
    }

    public static void llenarMatrizAleatoria(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(100); // Genera valores aleatorios entre 0 y 99
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int calcularSumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
    
    

