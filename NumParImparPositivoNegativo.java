package desafiosMatetaticosEmJava;

import java.util.Scanner;
/*Voc� deve fazer a leitura de 5 valores inteiros. 
 * Em seguida mostre quantos valores informados s�o pares, quantos valores informados s�o �mpares, 
 * quantos valores informados s�o positivos e quantos valores informados s�o negativos
 */

public class NumParImparPositivoNegativo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int contPar = 0, contImpar = 0, contPos = 0, contNeg = 0;

		for (int i = 0; i < 5; i++) {
			int valor = leitor.nextInt();
			if (valor % 2 == 0) {
				contPar++;
			} else {
				contImpar++;
			}
			if (valor > 1) {
				contPos++;
			} else if(valor < 0){
				contNeg++;
			}
		}

		System.out.println(contPar + " valor(es) par(es)");
		System.out.println(contImpar + " valor(es) impar(es)");
		System.out.println(contPos + " valor(es) positivo(s)");
		System.out.println(contNeg + " valor(es) negativo(s)");
		
		leitor.close();
	}

}
