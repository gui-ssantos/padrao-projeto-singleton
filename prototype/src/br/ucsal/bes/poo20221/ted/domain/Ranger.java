package br.ucsal.bes.poo20221.ted.domain;

public final class Ranger extends Personagem {
	
	//Construtor privado para ser acessado apenas pelo getInstancia
	private Ranger(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
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
	
	//Atributo de instância que será usado para a criação.
	 private static Ranger INSTANCIA;
	 
	//Metódo que instancia um novo ladino apenas se não há uma instância já criada.
	 public static Ranger getInstancia(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			    int frc, int des, int con, int itl, int sab, int car,
			    boolean rastreadorEficaz, boolean rastroInvisivel, boolean camuflagem) {
			    		if (INSTANCIA == null) {
			    			INSTANCIA = new Ranger(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car,
			                rastreadorEficaz, rastroInvisivel, camuflagem);
			            }
			            return INSTANCIA;
			        }

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