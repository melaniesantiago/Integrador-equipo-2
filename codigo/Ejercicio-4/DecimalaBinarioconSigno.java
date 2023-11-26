import java.util.Scanner;
public class DecimalaBinarioconSigno {

  
    public static void main(String[] args) {
        //entrada
             Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número decimal
        System.out.print("Ingrese un número decimal: ");
        int numeroDecimal = entrada.nextInt();

        // Verificar si el número es negativo
        boolean esNegativo = false;
        if (numeroDecimal < 0) {
            esNegativo = true;
            numeroDecimal = Math.abs(numeroDecimal);
        }

        // Inicializar una cadena para almacenar el número binario
        String numeroBinario = "";

        // Manejar el caso especial cuando el número decimal es 0
        if (numeroDecimal == 0) {
            numeroBinario = "0";
        } else {
            // Convertir el número decimal a binario
            while (numeroDecimal > 0) {
                int residuo = numeroDecimal % 2; // Obtener el residuo de la división por 2
                numeroBinario = residuo + numeroBinario; // Agregar el residuo al inicio de la cadena binaria
                numeroDecimal = numeroDecimal / 2; // Dividir el número decimal por 2
            }

            // Calcular el complemento a dos si el número es negativo
            if (esNegativo) {
                StringBuilder complementoBuilder = new StringBuilder();
                boolean encontradoPrimerUno = false;

                // Invertir los bits
                for (int i = numeroBinario.length() - 1; i >= 0; i--) {
                    char bit = numeroBinario.charAt(i);
                    if (!encontradoPrimerUno) {
                 
                        if (bit == '1') {
                            encontradoPrimerUno = true;
                        }
                        complementoBuilder.insert(0, bit);
                    } else {
                        // Invertir los bits restantes
                        if (bit == '0') {
                            complementoBuilder.insert(0, '1');
                        } else {
                            complementoBuilder.insert(0, '0');
                        }
                    }
                }

                numeroBinario = complementoBuilder.toString();
            }
        }

        // Agregar signo negativo si corresponde
        if (esNegativo) {
            numeroBinario = "" + numeroBinario;
        }

        // Imprimir el número binario resultante
        System.out.println("El número binario equivalente es: " + numeroBinario);
    }
}
