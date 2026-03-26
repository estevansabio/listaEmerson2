package pctEx12;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int idade;
		
		System.out.println("informe sua idade: ");
		idade= receba.nextInt();
		
		if(idade <12) {
			System.out.println("Você é criança:");
			
		}else if(idade < 17) {
			System.out.println("Você é adolescente");
		}else {
			System.out.println("Você é adulto");
		}

	}

}
