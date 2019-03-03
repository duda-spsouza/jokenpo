package jokenpo;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * 1-Pedra
 * 2-Papel
 * 3-Tesoura
 */

public class RegrasTest {

	@Test
	public void Pedra_Empate() {
		assertEquals("Empate.", Regras.analisaJogadas(1, 1));
	}
	
	@Test
	public void Pedra_Vitoria() {
		assertEquals("Jogador venceu!", Regras.analisaJogadas(1, 3));
	}
	
	@Test
	public void Pedra_Derrota() {
		assertEquals("Computador venceu!", Regras.analisaJogadas(1, 2));
	}

	@Test
	public void Tesoura_Empate() {
		assertEquals("Empate.", Regras.analisaJogadas(3, 3));
	}
	
	@Test
	public void Tesoura_Vitoria() {
		assertEquals("Jogador venceu!", Regras.analisaJogadas(3, 2));
	}
	
	@Test
	public void Tesoura_Derrota() {
		assertEquals("Computador venceu!", Regras.analisaJogadas(3, 1));
	}
	
	@Test
	public void Papel_Empate() {
		assertEquals("Empate.", Regras.analisaJogadas(2, 2));
	}
	
	@Test
	public void Papel_Vitoria() {
		assertEquals("Jogador venceu!", Regras.analisaJogadas(2, 1));
	}
	
	@Test
	public void Papel_Derrota() {
		assertEquals("Computador venceu!", Regras.analisaJogadas(2, 3));
	}
	
	@Test
	public void Tesoura_ErroVitoria() {
		assertEquals("Jogador venceu!", Regras.analisaJogadas(3, 1));
	}

}
