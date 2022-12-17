package lista1;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[]args) { 

		Scanner sc= new Scanner(System.in); 

		System.out.println("Digite a diagonal maior:"); 

		int Dmaior=sc.nextInt(); 

		System.out.println(Dmaior); 

		System.out.println("Digite a diagonal menor:"); 

		int dmenor=sc.nextInt(); 

		System.out.println(dmenor); 

		int area = Dmaior * dmenor / 2; 

		System.out.println("A área do losango é:"+area); 

		} 
}
