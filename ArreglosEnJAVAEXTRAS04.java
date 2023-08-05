
package arreglosenjavaextras04;

import java.util.Scanner;


public class ArreglosEnJAVAEXTRAS04 {

   
    public static void main(String[] args) {
       
        int cantidadAlumnos = 10;
        double[] promedios = new double[cantidadAlumnos];
        int aprobados = 0;
        int desaprobados = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Alumno " + (i + 1));
            double nota1 = cargarNota("Primer trabajo práctico evaluativo: ", scanner);
            double nota2 = cargarNota("Segundo trabajo práctico evaluativo: ", scanner);
            double nota3 = cargarNota("Primer Integrador: ", scanner);
            double nota4 = cargarNota("Segundo Integrador: ", scanner);

            double promedio = calcularPromedio(nota1, nota2, nota3, nota4);
            promedios[i] = promedio;

            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }

        scanner.close();

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
    }

    public static double cargarNota(String mensaje, Scanner scanner) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double calcularPromedio(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 * 0.10 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.50);
    }
}
        

