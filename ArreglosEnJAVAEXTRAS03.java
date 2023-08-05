
package arreglosenjavaextras03;

import java.util.Random;


public class ArreglosEnJAVAEXTRAS03 {

    
    public static void main(String[] args) {
       
        int N = 10; 
        int[] vector = new int[N];

        
        rellenarVectorAleatorio(vector);

       
        imprimirVector(vector);
    }

    public static void rellenarVectorAleatorio(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
    }

    public static void imprimirVector(int[] vector) {
        System.out.print("Vector: ");
        for (int elemento : vector) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
    }
    

