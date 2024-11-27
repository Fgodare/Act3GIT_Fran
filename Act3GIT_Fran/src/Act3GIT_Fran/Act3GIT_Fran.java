package Act3GIT_Fran;

import java.util.*;

public class Act3GIT_Fran {

    public static void main(String[] args) {

        // Generar y mostrar 30 números aleatorios entre 1 y 10
        Random rand = new Random();
        System.out.println("Números aleatorios entre 1 y 10:");
        for (int i = 0; i < 30; i++) {
            System.out.println(rand.nextInt(10) + 1);
        }

        // Solicitar números al usuario
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.print("Introduce un tercer número: ");
        int num3 = sc.nextInt();
        
        // Verificar que los dos primeros números sean distintos
        if (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
            return;
        }

        // Determinar el rango entre num1 y num2
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        // Mostrar los números en el rango de menor a mayor
        System.out.println("Números entre " + menor + " y " + mayor + " incrementados de 7 en 7:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
            if (i == num3) {
                System.out.println("El tercer número está en el rango.");
            }
        }
    }
}
