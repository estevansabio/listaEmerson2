package pctEx11;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int num;
		
		System.out.println("Diga um numero");
		num= receba.nextInt();
		
		if(num<10) {
			System.out.println("Seu é pequeno ):");
		}else if ((num >=10) && num < 50 ) {
			System.out.println("Seu numero é médio |:");
		}else {
			System.out.println("Seu numero é grande (:");
		}
	}

}
