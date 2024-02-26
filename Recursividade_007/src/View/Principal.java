package View;

import Controller.div;

import java.util.*;

public class Principal {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		div div = new div();
		
		System.out.print("Insira o dividendo: ");
		
		int A = scan.nextInt();
		
		System.out.print("Insira o divisor: ");
		
		int B = scan.nextInt();
		
		if (B > 0 ) {
		System.out.println("Resultado: " + div.funcDiv(A, B));
		
		} 
		
		
		System.out.println("Sem divisão por 0 >:(");
				
	}
	
	
	
}
