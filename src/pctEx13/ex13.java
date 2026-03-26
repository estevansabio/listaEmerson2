package pctEx13;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int nota;
		
		System.out.println("Me diga sua nota:");
		nota=receba.nextInt();
		
		if(nota>=7) {
			System.out.println("Você passou (:");
		}else if ((nota<7) && nota>5) {
			System.out.println("Você está em recuperação |:");
		}else {
			System.out.println("Você não passou ):");
		}

	}

}
