import java.util.Scanner;
import java.lang.Math;

public class RectaAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener las coordenadas del punto A
        System.out.print("Ingrese la coordenada x del punto A: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del punto A: ");
        double y1 = scanner.nextDouble();

        // Obtener las coordenadas del punto B
        System.out.print("Ingrese la coordenada x del punto B: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del punto B: ");
        double y2 = scanner.nextDouble();

        // Calcular la pendiente de la recta (m)
        double m = (y2 - y1) / (x2 - x1);

        // Calcular el ángulo interno α
        double alpha = Math.atan(m);

        // Imprimir los resultados
        System.out.println("La pendiente de la recta es: " + m);
        System.out.println("El ángulo interno α es: " + Math.toDegrees(alpha) + " grados.");

        scanner.close();
    }
}