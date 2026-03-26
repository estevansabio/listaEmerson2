package pctEx04;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("Qual a sua idade? ");
		num = receba.nextInt();
		
		if(num>=60) {
			System.out.println("Você tem 60 anos ou mais (: ");
		}else {
			System.out.println("Você tem menos de 60 anos ): ");
		}

	}

}
