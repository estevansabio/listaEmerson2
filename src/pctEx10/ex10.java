package pctEx10;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		double num;
		
		System.out.println("Digite sua nota: ");
		num = receba.nextDouble();
		
		if( num >7) {
			System.out.println("Você passou (:");
			
		}else {
			System.out.println("Você não passou ):");
		}
	}

}
