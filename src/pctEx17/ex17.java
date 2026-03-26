package pctEx17;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba =  new Scanner(System.in);
		int num;
		
		System.out.println("Digite sua idade");
		num=receba.nextInt();
		
		if((num >=18) && num<60) {
			System.out.println("Uau, você ainda é adulto");
		
		}else if(num>=60) {
			System.out.println("Você já é idoso");
		
		}

	}

}