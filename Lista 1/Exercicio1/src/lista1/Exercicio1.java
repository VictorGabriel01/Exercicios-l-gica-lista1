package lista1;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[]args) { 

		Scanner sc= new Scanner(System.in);  

		System.out.println("Digite um número:"); 

		int numero=sc.nextInt(); 

		System.out.println(numero); 

		int antecessor= numero -1; 

		System.out.println("O antecessor é:"+antecessor); 

		} 
	
}
