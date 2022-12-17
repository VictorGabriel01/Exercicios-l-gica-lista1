package lista1;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[]args) { 

		Scanner sc= new Scanner(System.in); 

		System.out.println("Digite a altura:"); 

		int altura=sc.nextInt(); 

		System.out.println(altura); 

		System.out.println("Digite a base maior:"); 

		int Bmaior=sc.nextInt(); 

		System.out.println(Bmaior); 

		System.out.println("Digite a base menor:"); 

		int bmenor=sc.nextInt(); 

		System.out.println(bmenor); 

		int area = (Bmaior+bmenor)*altura/2; 

		System.out.println("A área do trapézio é:"+area); 
		} 
}
