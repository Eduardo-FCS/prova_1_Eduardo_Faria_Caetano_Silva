package br.edu.univas.main;
import java.util.Scanner;
public class questao1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contador = 0;
		for(int i = 0;;i++) {
			int numero = scanner.nextInt();
			if(numero < 0) {
				contador++;
			} else if(numero > 0) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("Foram digitados " + contador + " números negativos");
		scanner.close();
	}
}
