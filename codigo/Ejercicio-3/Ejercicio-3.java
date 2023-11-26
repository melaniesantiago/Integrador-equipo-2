
import java.util.Scanner;

public class ejercicio3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la coordenada x1");
        double x1 = scanner.nextDouble();
        System.out.println("Ingrese la coordenada y1");
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese el radio de la circunferencia (r):");
        double r = scanner.nextDouble();

        System.out.println("Ingrese la coordenada a evaluar con el punto x2");
        double Tx2 = scanner.nextDouble();
        System.out.println("ingrese la coordenada a evaluar con el punto y2");
        double Ty2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(Tx2 - x1, 2) + Math.pow(Ty2 - y1, 2));

        if (distancia <= r) {
            System.out.println("El punto se encuentra dentro del area de la circunferencia.");
        } else {
            System.out.println("El punto esta fuera del area de la circunferencia.");
        }
    }
    
}
