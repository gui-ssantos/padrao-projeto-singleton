package br.ucsal.bes.poo20221.ted.domain;

public final class Barbaro extends Personagem {

	//Construtor privado para ser acessado apenas pelo getInstancia
	private Barbaro(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			int frc, int des, int con, int itl, int sab, int car,
			boolean esquivaN, boolean furia, boolean reducaoDano) {
		
		super(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car);
		
		this.esquivaN = esquivaN;
		this.furia = furia;
		this.reducaoDano = reducaoDano;
		
	}
	
	
	// habilidades unicas de barbaro
	// achei melhor colocar só 3 habilidades por classe de personagem, pra não ficar
	// muita coisa desnecessária
	// minha ideia foi colocar boolean pra tipo, se o personagem tiver essa
	// habilidade, coloca true
	private boolean esquivaN; // esquiva natural
	private boolean furia;
	private boolean reducaoDano;
	
	//Atributo de instância que será usado para a criação.
	private static Barbaro INSTANCIA;
	//Metódo que instancia um novo bárbaro apenas se não há uma instância já criada.
	public static Barbaro getInstancia(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			int frc, int des, int con, int itl, int sab, int car,
			boolean esquivaN, boolean furia, boolean reducaoDano) {
		if (INSTANCIA == null) {
			INSTANCIA = new Barbaro(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des,
			con, itl, sab, car, esquivaN, furia, reducaoDano);
		}
		return INSTANCIA;
	}
	

	public boolean isEsquivaN() {
		return esquivaN;
	}

	public void setEsquivaN(boolean esquivaN) {
		this.esquivaN = esquivaN;
	}

	public boolean isFuria() {
		return furia;
	}

	public void setFuria(boolean furia) {
		this.furia = furia;
	}

	public boolean isReducaoDano() {
		return reducaoDano;
	}

	public void setReducaoDano(boolean reducaoDano) {
		this.reducaoDano = reducaoDano;
	}

	@Override
	public String toString() {
		String ficha;
		ficha = "Nome do Jogador: " + this.getNomePlayer() + "\nNome do Personagem: " + this.getNomeChar() + "\nIdade do Personagem: "
				+ this.getIdade() + "\nRaça: " + this.getRaca() + "\nPontos de vida: " + this.getPv() + "\nNível: "
				+ this.getNivel() + "\nForça: " + this.getFrc() + "\nDestreza: " + this.getDes() + "\nConstituição: " + this.getCon() + "\n Inteligência: " + this.getItl()
				+ "\nSabedoria: " + this.getSab() + "\nCarisma: " + this.getCar() + "\nTem a skill Esquiva Natural? " + isEsquivaN()
				+ "\nTem a skill Fúria?" + isFuria() + "\nTem a skill Redução de dano? " + isReducaoDano();
		return ficha;
	}
}