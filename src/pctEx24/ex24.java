package pctEx24;

import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba =  new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número e veja se ele é o especial!!!");
		num=receba.nextInt();
		
		if((num ==20) || num==10) {
			System.out.println("Você acertou o número especial");
		
		}else {
			System.out.println("Você errou o número especial, tente novamente");
		}

	}

}