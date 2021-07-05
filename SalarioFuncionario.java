package desafiosMatetaticosEmJava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, 
 * por�m temos apenas a quantidade de horas trabalhadas e o valor hora. 
 * Escreva um programa que leia o n�mero de um colaborador, seu n�mero de horas trabalhadas, 
 * o valor que recebe por hora e calcula o sal�rio desse colaborador. 
 * Em seguida, apresente o n�mero e o sal�rio do colaborador, com duas casas decimais.
 */

public class SalarioFuncionario {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int valor1 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    int valor2 = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    double valor3 = Double.parseDouble(st.nextToken());

    double salary = valor2 * valor3; 
    System.out.println("NUMBER = " + valor1);
    System.out.printf("SALARY = U$ %.2f", salary);
  }
}
