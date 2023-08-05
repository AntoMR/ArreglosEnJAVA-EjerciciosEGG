
package arreglosenjava02;

import java.util.Scanner;


public class ArreglosEnJAVA02 {

  
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector (N): ");
        int N = sc.nextInt();

        int[] vector = new int[N];

        // Llenar el vector con valores aleatorios entre 1 y 100
        for (int i = 0; i < N; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }

        // Mostrar el vector generado
        System.out.print("Vector generado: ");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Ingrese el número a buscar en el vector: ");
        int numeroBuscado = sc.nextInt();

        // Buscar el número en el vector y verificar si está repetido
        boolean encontrado = false;
        boolean repetido = false;
        int primeraPosicion = -1;

        for (int i = 0; i < N; i++) {
            if (vector[i] == numeroBuscado) {
                encontrado = true;
                if (!repetido) {
                    primeraPosicion = i;
                    repetido = true;
                }
            }
        }

        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " se encuentra en el vector.");

            if (repetido) {
                System.out.println("El número " + numeroBuscado + " está repetido en el vector.");
                System.out.println("Primera posición: " + primeraPosicion);
            } else {
                System.out.println("El número " + numeroBuscado + " no está repetido en el vector.");
            }
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector.");
        }

    }
    
}
