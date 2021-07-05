package desafiosMatetaticosEmJava;

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final double PI = 3.14159;
		double area;
		double raio = scan.nextDouble();

		area = PI * (Math.pow(raio, 2));

		System.out.printf("A=%.4f\n", area);

		scan.close();
	}

}
