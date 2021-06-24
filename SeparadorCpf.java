package desafios.digital.one;

import java.util.Locale;
import java.util.Scanner;

public class SeparadorCpf {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));

		Scanner sc = new Scanner(System.in);

		String[] cpf = new String[4];

		System.out.println("Digite um cpf: ");
		cpf = sc.nextLine().split("-");

		for (int i = 0; i < cpf.length; i++) {
			System.out.printf("%s\n", cpf[i].replace(".", "\n"));
		}

		sc.close();

	}

}
