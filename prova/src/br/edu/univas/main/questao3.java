package br.edu.univas.main;

import java.util.Scanner;

public class questao3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0;;i++) {
			int leitura = scanner.nextInt();
			if(leitura % 5 == 0) {
				System.out.println(leitura + " - " + leitura);
			} else if(leitura % 5 != 0 && (leitura + 2) % 5 == 0) {
				System.out.println(leitura + " - " + (leitura + 2));
			} else if(leitura % 5 != 0 && (leitura + 1) % 5 == 0) {
				System.out.println(leitura + " - " + (leitura + 1));
			} else {
				System.out.println(leitura + " - " + leitura);
			}
		}
		scanner.close();
	}

}
