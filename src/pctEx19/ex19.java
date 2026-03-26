package pctEx19;

import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int nota;
		
		System.out.println("Me diga sua nota:");
		nota=receba.nextInt();
		
		if(nota>9) {
			System.out.println("Você foi excelente(:");
		}else if (nota>=7) {
			System.out.println("Você está em passou (:");
		}else if((nota<7) && nota>5) {
			System.out.println("Você esta de recuperação |:");
		}else {
			System.out.println("Você não passou): ");
		}

	}

}
