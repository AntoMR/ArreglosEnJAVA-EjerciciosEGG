
package arreglosenjava01;


public class ArreglosEnJAVA01 {

  
    public static void main(String[] args) {
      
        int[] numeros = new int[100];

        // Llenar el vector con los 100 primeros números enteros en orden ascendente
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Mostrar los números en orden descendente
        System.out.println("Números en orden descendente:");

        for (int i = 99; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
    
}
