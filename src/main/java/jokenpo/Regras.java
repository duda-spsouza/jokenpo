package jokenpo;

public class Regras {

	/*
	 * Retorna a mensagem com o vencedor do jogo
	 * 1- Pedra empata com Pedra e ganha de Tesoura
	 * 2- Tesoura empata com Tesoura e ganha de Papel
	 * 3- Papel empata com Papel e ganha de Pedra
	 */
	
	public static String analisaJogadas(int jogador, int computador) {
		
		String msg = "";
		
		if(jogador!=computador) {
			if((jogador==1 && computador==3) || (jogador==2 && computador==1)|| (jogador==3 && computador==2)) {
				msg = "Jogador Venceu";
			}else {
				msg = "Computador Venceu";
			}
			
		}else {
			msg = "EMPATE";
		}
		
		
		return msg;
	}

}
