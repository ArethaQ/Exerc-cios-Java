package Familia51;

import java.util.Scanner;

class Atividade01dia010422 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	       
	       System.out.println("\nDigite um n�mero inteiro de sua prefer�ncia: ");
	       int num1 = leia.nextInt();
	       System.out.println("Digite outro n�mero inteiro de sua prefer�ncia: ");
	       int num2 = leia.nextInt();
	       System.out.println("Digite mais um n�mero inteiro de sua prefer�ncia: ");
	       int num3 = leia.nextInt();
	       
	       int maior;
	    		   
	       if(num3>num2 && num3>num1){
	    	   maior =num3;
	       } else if(num2>num3 && num2>num1){
	    	   maior = num2;
	       } else {
	    	   maior = num1;
	       }
	       
	       System.out.println("O maior n�mero digitado foi: " + maior);
	       
	    	 
	}

}
