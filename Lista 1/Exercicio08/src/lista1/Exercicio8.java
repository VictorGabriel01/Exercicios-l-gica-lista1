package lista1;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[]args) { 

		Scanner sc= new Scanner(System.in); 

		System.out.println("Digite a altura:"); 

		int altura=sc.nextInt(); 

		System.out.println(altura); 

		System.out.println("Digite a base:"); 

		int base=sc.nextInt(); 

		System.out.println(base); 

		int area= base * altura / 2; 

		System.out.println("A area do triângulo é:"+area); 
}
