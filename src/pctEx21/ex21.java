package pctEx21;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int idade;
		
		System.out.println("informe sua idade: ");
		idade= receba.nextInt();
		

        if (idade >= 18 && idade < 70) {
            System.out.println("A pessoa pode tirar a carteira de motorista");
        } else {
            System.out.println("A pessoa não pode tirar a carteira de motorista");
        }

    
    }
}