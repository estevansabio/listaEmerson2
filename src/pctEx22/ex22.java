package pctEx22;

import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int nota, frequencia;
		
		System.out.println("Me diga sua nota e a sua frequência:");
		nota=receba.nextInt();
		frequencia=receba.nextInt();
		if((nota>=6) && frequencia>=75) {
			System.out.println("Você passou (:");
		}else {
			System.out.println("Você reprovou ):");
		}
		

	}

}
