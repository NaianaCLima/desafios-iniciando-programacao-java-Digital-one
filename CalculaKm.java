package desafiosMatetaticosEmJava;

import java.util.Scanner;
/*Rubens quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem de carro, 
 * sendo que seu carro faz 12 KM/L. Como ele n�o sabe fazer um programa que o auxilie nessa miss�o, 
 * ele te pede ajuda. Para efetuar o c�lculo, deve-se fornecer o tempo gasto em horas na viagem e a 
 * velocidade m�dia durante a mesma em km/h. Assim, voc� conseguir� passar para Rubens 
 * qual a dist�ncia percorrida e, em seguida, calcular quant
 * os litros ser�o necess�rios para a viagem que ele quer fazer. 
 * Mostre o valor com 3 casas decimais ap�s o ponto.
 */

public class CalculaKm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tempo = scan.nextInt();
		int velocidade = scan.nextInt();
		final double KM_POR_LITRO = 12.0;

		System.out.printf("%.3f\n", (tempo * velocidade) / KM_POR_LITRO);

		scan.close();
	}

}
