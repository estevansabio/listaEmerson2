package pctEx20;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba =  new Scanner(System.in);
		int num;
		
		System.out.println("Digite sua idade");
		num=receba.nextInt();
		
		if((num >=18) && num<60) {
			System.out.println("Uau, você ainda é adulto");
		
		}else if((num>=60) && num<65) {
			System.out.println("Você já é idoso");
		
		}else if(num>65) {
			System.out.println("Você já pode se aposentar");
		}

	}

}