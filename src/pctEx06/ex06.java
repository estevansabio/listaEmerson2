package pctEx06;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
	   Scanner receba = new Scanner (System.in);
	   int num;
	    
	   System.out.println("Digite um número: ");
	   num = receba.nextInt();   
	   if ( (num % 2) == 0 ) {
		   System.out.println("Seu número é par");
	   }else {
		   System.out.println("Seu número é impar");
	   }

	}

}
