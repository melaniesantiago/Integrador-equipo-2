import java.util.Scanner;

public class recta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del punto A:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del punto B:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        // Calcular la pendiente de la recta
        double pendiente = (y2 - y1) / (x2 - x1);

        // Calcular el ángulo en radianes
        double anguloRadianes = Math.atan(pendiente);

        // Convertir el ángulo a grados
        double anguloGrados = Math.toDegrees(anguloRadianes);

        // Calcular el ángulo interno α entre el eje horizontal y la recta
        double anguloInterno = 90 - anguloGrados;

        // Calcular el punto de intersección con el eje y (cuando x = 0)
        double puntoInterseccionY = y1 - pendiente * x1;

        // Construir la ecuación de la recta en formato y = mx + b
        String ecuacionRecta = "y = " + pendiente + "x + " + puntoInterseccionY;

        System.out.println("Ecuación de la recta: " + ecuacionRecta);
        System.out.println("Ángulo interno α: " + anguloInterno + "grados");
        System.out.println("Punto de intersección con el eje y: (0, " + puntoInterseccionY + ")");
        System.out.println("Pendiente = "+pendiente);
       
    }
}