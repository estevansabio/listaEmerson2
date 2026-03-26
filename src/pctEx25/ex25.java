package pctEx25;

import java.util.Scanner;

public class ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba =  new Scanner(System.in);
		int num;
		
		System.out.println("digite um numero");
		num=receba.nextInt();
		
		if(!(num ==0)  ) {
			System.out.println("numero diferente de zero");
		
		}else {
			System.out.println("numero igual a zero");
		}

	}

}