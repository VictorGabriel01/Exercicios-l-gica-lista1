package lista1;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[]args) { 

		Scanner sc= new Scanner(System.in); 

		System.out.println("Digite o raio:"); 

		int raio=sc.nextInt(); 

		System.out.println(raio); 

		float area = (float) Math.PI * raio*raio; 

		System.out.println("A área do círculo é:"+area); 

		} 
}
