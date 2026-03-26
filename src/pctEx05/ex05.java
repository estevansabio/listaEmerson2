package pctEx05;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner receba =  new Scanner(System.in);
   int num;
   
   System.out.println("Qual a temperatura de hoje? ");
   num = receba.nextInt();
   
   if(num > 30) {
	   System.out.println("Está muito quente, é a temperatura é mais de 30 graus!");
	   
   }else {
	   System.out.println("Está com temperatura média, abaixo de 30 graus");
   }
	}

}
