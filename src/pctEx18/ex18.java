package pctEx18;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner receba = new Scanner(System.in);
 int num1, num2;
 
 System.out.println("Digite dois número: ");
 num1 = receba.nextInt();
 num2 = receba.nextInt();
 
 if (num1 > num2) {
	 System.out.println("O número " + num1+ " é maior");
 }else if(num1==num2){
	 System.out.println("Os numeros são iguais");
	 
 }else {
	 System.out.println("O número " +num2+ " é maior");
 }
	}

}
