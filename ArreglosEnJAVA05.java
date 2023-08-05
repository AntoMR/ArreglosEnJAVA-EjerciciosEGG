
package arreglosenjava05;


public class ArreglosEnJAVA05 {

   
    public static void main(String[] args) {
       
        int[][] matriz = {
            { 0, 1, -2 },
            { -1, 0, 3 },
            { 2, -3, 0 }
        };
        
        boolean esAntisimetrica = esMatrizAntisimetrica(matriz);
        
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }
    
    public static boolean esMatrizAntisimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        if (filas != columnas) {
            return false;
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        
        return true;
    }
    }
    

