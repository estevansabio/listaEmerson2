package pctEx14;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner receba = new Scanner(System.in);
 int num;
 
 System.out.println("Digite um número!");
 num = receba.nextInt();
 
 if(num>0) {
	 System.out.println("Seu número é positivo!");
 }else if (num==0){
	 System.out.println("Seu número é zero");
 }else {
	 System.out.println("Seu numero é negativo");
 }
	}
}