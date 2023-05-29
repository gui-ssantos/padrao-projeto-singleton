package br.ucsal.bes.poo20221.ted.domain;

public class Ranger extends Personagem {
	
	public Ranger() {
		super();
	}
	public Ranger(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			int frc, int des, int con, int itl, int sab, int car,
			boolean rastreadorEficaz, boolean rastroInvisivel, boolean camuflagem) {
		
		super(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car);
		
		this.rastreadorEficaz = rastreadorEficaz;
		this.rastroInvisivel = rastroInvisivel;
		this.camuflagem = camuflagem;
	}

	// https://tsrd.fandom.com/pt-br/wiki/Per%C3%ADcias_B%C3%A1sico
	private boolean rastreadorEficaz;
	private boolean rastroInvisivel;
	private boolean camuflagem;

	private String PrincipalAtaque = "Prepare-se para ataques de longa distância!";

	// getters e setters
	public boolean isRastreadorEficaz() {
		return rastreadorEficaz;
	}

	public void setRastreadorEficaz(boolean rastreadorEficaz) {
		this.rastreadorEficaz = rastreadorEficaz;
	}

	public boolean isRastroInvisivel() {
		return rastroInvisivel;
	}

	public void setRastroInvisivel(boolean rastroInvisivel) {
		this.rastroInvisivel = rastroInvisivel;
	}

	public boolean isCamuflagem() {
		return camuflagem;
	}

	public void setCamuflagem(boolean camuflagem) {
		this.camuflagem = camuflagem;
	}

	public String getPrincipalAtaque() {
		return PrincipalAtaque;
	}

	public void setPrincipalAtaque(String PrincipalAtaque) {
		this.PrincipalAtaque = PrincipalAtaque;
	}
	@Override
	public String toString() {
		String ficha;
		ficha = "Nome do Jogador: " + this.getNomePlayer() + "\nNome do Personagem: " + this.getNomeChar() + "\nIdade do Personagem: "
				+ this.getIdade() + "\nRaça: " + this.getRaca() + "\nPontos de vida: " + this.getPv() + "\nNível: "
				+ this.getNivel() + "\nForça: " + this.getFrc() + "\nDestreza: " + this.getDes() + "\nConstituição: " + this.getCon() + "\n Inteligência: " + this.getItl()
				+ "\nSabedoria: " + this.getSab() + "\nCarisma: " + this.getCar() + "\nTem a skill Rastreador Eficaz? " + isRastreadorEficaz()
				+ "\nTem a skill Rastro Invisível?" + isRastroInvisivel() + "\nTem a skill Camuflagem? " + isCamuflagem();
	return ficha;
	}
}