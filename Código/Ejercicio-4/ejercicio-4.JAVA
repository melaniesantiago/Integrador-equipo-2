import java.util.Scanner;

public class ecuacioncuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los coeficientes de la ecuación cuadrática:");
        System.out.print("Coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Coeficiente c: ");
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;
                if (discriminante >= 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las raíces reales son:");
            System.out.println("Raíz 1: " + raiz1);
            System.out.println("Raíz 2: " + raiz2);
        } else {
            System.out.println("La solución está en el conjunto de los números complejos.");
        }
    }
}