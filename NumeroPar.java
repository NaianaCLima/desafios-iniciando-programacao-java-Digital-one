package desafios.digital.one;

import java.util.Scanner;
import java.util.stream.IntStream;

public class NumeroPar {
	public static void main(String[] args) {

		int N = new Scanner(System.in).nextInt();

		numPar(N).forEach(System.out::println);
	}

	public static IntStream numPar(int N) {
		IntStream exibirNumerosPares = IntStream.rangeClosed(1, N);
		return exibirNumerosPares.filter(a -> a % 2 == 0);

	}

}
