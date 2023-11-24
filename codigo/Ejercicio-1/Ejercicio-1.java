import java.util.Scanner;
import java.lang.Math;

public class recta {
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

        // Calcular el ángulo de inclinación en radianes
        double theta = Math.atan(m);

        // Calcular el punto de intersección con el eje y (0, b)
        double b = y1 - m * x1;

        // Imprimir los resultados
        System.out.println("La pendiente de la recta es: " + m);
        System.out.println("El ángulo de inclinación es: " + Math.toDegrees(theta) + " grados.");
        System.out.println("El punto de intersección con el eje y es: (0, " + b + ")");

        scanner.close();
    }
}