package pctEx15;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner receba =  new Scanner(System.in);
   int num;
   
   System.out.println("Qual a temperatura de hoje? ");
   num = receba.nextInt();
   
   if(num < 15) {
	   System.out.println("Está muito frio!");
	   
   }else if((num >= 15) && num <25) {
	   System.out.println("o tempo esta agradavel");
   }else {
	   System.out.println("hoje esta muito quente:");
   }
	}

}