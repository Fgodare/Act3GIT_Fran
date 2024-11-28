package Act3GIT_FranVS;

import java.util.*;

public class Act3GIT_FranVS {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos números distintos:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
            return;
        }

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        for (int i = start; i <= end; i += 7) {
            System.out.println(i);
        }

	}

}
