
package arreglosenjavaextras06;

import java.util.Scanner;


public class ArreglosEnJAVAEXTRAS06 {

   
    public static void main(String[] args) {
       
        int filas = 20;
        int columnas = 20;
        int cantidadPalabras = 5;

        char[][] sopaLetras = new char[filas][columnas];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidadPalabras; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + " (entre 3 y 5 caracteres): ");
            String palabra = scanner.nextLine();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                System.out.print("Ingrese la palabra " + (i + 1) + ": ");
                palabra = scanner.nextLine();
            }
            ubicarPalabraEnSopa(palabra, sopaLetras);
        }

        rellenarEspaciosVacios(sopaLetras);

        mostrarSopaLetras(sopaLetras);

        scanner.close();
    }

    public static void ubicarPalabraEnSopa(String palabra, char[][] sopa) {
        int filaAleatoria = (int) (Math.random() * sopa.length);
        int columnaInicialAleatoria = (int) (Math.random() * (sopa[0].length - palabra.length()));

        for (int i = 0; i < palabra.length(); i++) {
            sopa[filaAleatoria][columnaInicialAleatoria + i] = palabra.charAt(i);
        }
    }

    public static void rellenarEspaciosVacios(char[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                if (sopa[i][j] == '\u0000') { // Carácter nulo
                    sopa[i][j] = (char) ('0' + (int) (Math.random() * 10));
                }
            }
        }
    }

    public static void mostrarSopaLetras(char[][] sopa) {
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[0].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }

       
        
               
    
}
