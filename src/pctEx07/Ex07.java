package pctEx07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		 Scanner receba = new Scanner(System.in);
		 int idade;
		
		 System.out.println("Informe a sua idade: ");
		 idade= receba.nextInt();
		 
		
			 if(idade>=18) {
				 System.out.println("Você é maior de idade (: ");
			 
		 }else {
			 System.out.println("Você é menor de idade ):");
		 }
	}

}
