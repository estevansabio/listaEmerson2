package pctEx08;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner receba = new Scanner(System.in);
 int num;
 
 System.out.println("Digite um número!");
 num = receba.nextInt();
 
 if(num>0) {
	 System.out.println("Seu número é positivo!");
 }else {
	 System.out.println("Seu número é negativo");
 }
	}

}
