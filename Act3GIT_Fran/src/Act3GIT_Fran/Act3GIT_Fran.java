package Act3GIT_Fran;

import java.util.*;

public class Act3GIT_Fran {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.print("Introduce un tercer número: ");
        int num3 = sc.nextInt();
        
        if (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
            return;
        }

        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);

        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
            if (i == num3) {
                System.out.println("El tercer número está en el rango.");
        }
        
     
	}

  }
}
