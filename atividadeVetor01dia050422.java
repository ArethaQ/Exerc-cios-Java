package Familia51;
/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre 
na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha. */


public class atividadeVetor01dia050422 {

	public static void main(String[] args) {
		
          int[] A = {1,0,5,-2,-5,7};
          int soma, i;
          soma = (A[0]+A[1]+A[5]);
          A[3] = 100;
          
          
          for(i=0;i<6;i++) {
        	  System.out.println("Posi��o do vetor A: "+A[i]);
          }
              System.out.println("\n\nResultado: "+soma);
          
		 
	}

}
