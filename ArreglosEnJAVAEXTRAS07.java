
package arreglosenjavaextras07;

import java.util.Scanner;


public class ArreglosEnJAVAEXTRAS07 {

   
    public static void main(String[] args) {
       
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de la sucesión de Fibonacci que desea calcular: ");
        int N = scanner.nextInt();
        
        long[] fibonacci = calcularSucesionFibonacci(N);
        
        System.out.println("Los primeros " + N + " números de la sucesión de Fibonacci son:");
        for (long num : fibonacci) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
    
    public static long[] calcularSucesionFibonacci(int N) {
        long[] fibonacci = new long[N];
        
        for (int i = 0; i < N; i++) {
            if (i <= 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        
        return fibonacci;
    }
    }
    

