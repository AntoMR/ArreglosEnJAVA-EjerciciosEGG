
package arreglosenjava04;

import java.util.Random;


public class ArreglosEnJAVA04 {

   
    public static void main(String[] args) {
       
        int[][] matriz = new int[4][4];
        
        // Rellenar la matriz con valores aleatorios
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100); // Valores entre 0 y 99
            }
        }
        
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);
        
        int[][] traspuesta = obtenerMatrizTraspuesta(matriz);
        
        System.out.println("\nMatriz traspuesta:");
        mostrarMatriz(traspuesta);
    }
    
    public static int[][] obtenerMatrizTraspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        int[][] traspuesta = new int[columnas][filas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }
        
        return traspuesta;
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
