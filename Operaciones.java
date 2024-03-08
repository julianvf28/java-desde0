import java.util.Scanner;

public class Operaciones{

    public static void main(String[] args) {

        float sumando1 = 0;
        float sumando2 = 0;
        float multiplicando1 = 0; 
        float multiplicando2 = 0;
        float dividendo1 = 0;
        float dividendo2 = 0;
        int operaciones = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer Sumando");
        sumando1 = entrada.nextFloat();
        System.out.println("Ingrese el segundo Sumando");
        sumando2 = entrada.nextFloat();
        System.out.println("Ingrese el primer Multiplicando");
        multiplicando1 = entrada.nextFloat();
        System.out.println("Ingrese el segundo Multiplicando");
        multiplicando2 = entrada.nextFloat();
        System.out.println("Ingrese el primer Dividendo");
        dividendo1 = entrada.nextFloat();
        System.out.println("Ingrese el segundo Dividendo");
        dividendo2 = entrada.nextFloat();
        System.out.println("Ingrese el numero de operaciones");
        operaciones = entrada.nextInt();
        System.out.println("La suma es: " + (sumando1 + sumando2));
        System.out.println("La multiplicacion es: " + (multiplicando1 * multiplicando2));
        System.out.println("La division es: " + (dividendo1 / dividendo2));
        System.out.println("El numero de operaciones es: " + operaciones);
        entrada.close();
        System.exit(0);
    }
}