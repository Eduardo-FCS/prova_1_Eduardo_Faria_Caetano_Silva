package br.edu.univas.main;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int contadorSim = 0, contadorNao = 0, contadorSul = 0, contadorSudeste = 0, contadorNorte = 0,
				contadorNordeste = 0, contadorCentro = 0;

		for (int i = 0; i < 100; i++) {
			
			System.out.println("Voc� acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			System.out.println("1 - Sim");
			System.out.println("2 - N�o");
			int question = scanner.nextInt();
			
			System.out.println("Qual regi�o do Brasil voc� mora?");
			System.out.println("1 - Sul");
			System.out.println("2 - Sudeste");
			System.out.println("3 - Centro-Oeste");
			System.out.println("4 - Norte");
			System.out.println("5 - Nordeste");
			int questao = scanner.nextInt();
			
			if (question >= 1 && question <= 2) {
				if (question == 1) {
					contadorSim++;
				} else {
					contadorNao++;
				}
			} else {
				System.out.println("D�gito incorreto, responda de acordo com o que se pede");
			}
			if (questao >= 1 && questao <= 5) {
				if (questao == 1) {
					contadorSul++;
				} else if (questao == 2) {
					contadorSudeste++;
				} else if (questao == 3) {
					contadorCentro++;
				} else if (questao == 4) {
					contadorNorte++;
				} else {
					contadorNordeste++;
				}
			} else {
				System.out.println("D�gito incorreto, responda de acordo com o que se pede");
			}
		}
		System.out.println("Foram " + contadorSim + " pessoas que votaram Sim � pesquisa");
		System.out.println("Foram " + contadorNao + " pessoas que votaram N�o � pesquisa");
		System.out.println("De todos os participantes que fizeram � enquete, " + contadorSul + " pessoas s�o da regi�o Sul");
		System.out.println("De todos os participantes que fizeram � enquete, " + contadorSudeste + " pessoas s�o da regi�o Sudeste");
		System.out.println("De todos os participantes que fizeram � enquete, " + contadorCentro + " pessoas s�o da regi�o Centro-Oeste");
		System.out.println("De todos os participantes que fizeram � enquete, " + contadorNorte + " pessoas s�o da regi�o Norte");
		System.out.println("De todos os participantes que fizeram � enquete, " + contadorNordeste + " pessoas s�o da regi�o Nordeste");
		scanner.close();
	}
}
