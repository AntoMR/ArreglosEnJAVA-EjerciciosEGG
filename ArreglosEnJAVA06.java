
package arreglosenjava06;

import java.util.Scanner;


public class ArreglosEnJAVA06 {

 
    public static void main(String[] args) {
        
         int[][] cuadrado = new int[3][3];
        boolean numerosCorrectos = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un cuadrado mágico 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Fila " + (i + 1) + ", Columna " + (j + 1) + ": ");
                cuadrado[i][j] = scanner.nextInt();

                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    numerosCorrectos = false;
                }
            }
        }

        scanner.close();

        if (!numerosCorrectos) {
            System.out.println("Los números introducidos deben estar entre 1 y 9.");
            return;
        }

        boolean esCuadradoMagico = verificarCuadradoMagico(cuadrado);

        if (esCuadradoMagico) {
            System.out.println("¡El cuadrado es mágico!");
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

    public static boolean verificarCuadradoMagico(int[][] cuadrado) {
        int sumaFila = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        for (int i = 1; i < 3; i++) {
            if (cuadrado[i][0] + cuadrado[i][1] + cuadrado[i][2] != sumaFila) {
                return false;
            }
        }

        int sumaColumna = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        for (int j = 1; j < 3; j++) {
            if (cuadrado[0][j] + cuadrado[1][j] + cuadrado[2][j] != sumaColumna) {
                return false;
            }
        }

        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];

        return sumaDiagonal1 == sumaFila && sumaDiagonal2 == sumaFila;
    }
}
    
    

