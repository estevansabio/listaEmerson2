package pctEx16;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba =  new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero");
		num=receba.nextInt();
		
		if((num >0) && num<50) {
			System.out.println("Seu numero é positivo");
		
		}else if(num>=50) {
			System.out.println("Além de ser positivo, ele é maior que 50");
		}else {
			System.out.println("Ele é negativo");
		}

	}

}
