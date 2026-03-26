package pctEx03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner receba =  new Scanner(System.in);
  int num;
  
  System.out.println("Digite um número");
  num = receba.nextInt();
  
  if(num<=100) {
	  System.out.println("Seu número é menor que 100");
  }else {
	  System.out.println("Seu número é maior que 100");
  }
	}

}
