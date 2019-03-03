package jokenpo;

import java.util.Scanner;

public class Jogo {
	
	public static void main(String[] args) {
		
		// l�gica do jogador
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("_____JOKENPO_____");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("Digite a op��o desejada");
		jogador = mao.nextInt();
		
		
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu papel");
			break;
		case 3:
			System.out.println("Jogador escolheu tesoura");
			break;

		default:
			System.out.println("Op��o Inv�lida ");
			break;
			
		}
		// l�gica do computador faz  o sorteio de 3 n�meros 
		int pc = (int)(Math.random()*3+1);
		switch (pc) {
		case 1:
			System.out.println("Computador escolheu pedra");
			break;
		case 2:
			System.out.println("Computador escolheu papel");
			break;
		case 3:
			System.out.println("Computador escolheu tesoura");
			break;	
		}
		System.out.println("--------------------------------");
		//Jogadas
		System.out.println(Regras.analisaJogadas(jogador,pc));
	}

}
