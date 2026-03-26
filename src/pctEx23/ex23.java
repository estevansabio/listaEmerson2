package pctEx23;

import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba =  new Scanner(System.in);
		int num;
		
		System.out.println("Digite sua idade");
		num=receba.nextInt();
		
		if((num >=60) || num<10) {
			System.out.println("Você tem atendimento prioritário");
		
		}else {
			System.out.println("Você não tem atendimento prioritário");
		}

	}

}