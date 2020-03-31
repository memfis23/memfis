import java.util.Scanner;

public class ConjeturaULAM {
    public static void main(String[] args) {
        System.out.println("Ingresa un numero entero positivo");
        Scanner entradaNumero = new Scanner(System.in);
        int numero;
        numero = entradaNumero.nextInt();

        System.out.println("La sucesión de ULAM es:");
        System.out.println(numero);

        while (numero != 1) {
            int residuo = numero - ( (numero / 2) * 2);
            if (residuo == 0) {
                numero = numero / 2;
                System.out.println(numero);
            } else {
                if (residuo == 1) {
                    numero = numero * 3 + 1;
                    System.out.println(numero);
                }
            }
        }
    }
}
