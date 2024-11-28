package Act3GIT_FranVS;

import java.util.*;

public class Act3GIT_FranVS {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
        System.out.println("Ingrese dos números distintos:");
=======
        System.out.println("Introduzca tres números distintos:");
>>>>>>> 25dd941 (Añado num3)
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
		int num3 = sc.nextInt();

        if (num1 == num2) {
<<<<<<< HEAD
            System.out.println("Los números deben ser distintos.");
=======
            System.out.println("Los números deben ser diferentes.");
>>>>>>> 25dd941 (Añado num3)
            return;
        }

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i += 7) {
            System.out.println(i);
			if(i == num3){
				System.out.println("El tercer número está en el rango.");
			}
        }

	}

}
