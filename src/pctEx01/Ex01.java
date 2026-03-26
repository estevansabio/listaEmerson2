package pctEx01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner receba = new Scanner(System.in);
    int num;
    
    System.out.println("Digite um número: ");
    num = receba.nextInt();
    
    if (num > 20) {
    	System.out.println("Seu número é maior que 20!");
    	
    }else {
    	System.out.println("Seu número é menor que 20");
    }
    
	}

}