package br.ucsal.bes.poo20221.ted.domain;

public final class Mago extends Personagem {
	
	

    //Construtor privado para ser acessado apenas pelo getInstancia
	public Mago(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			int frc, int des, int con, int itl, int sab, int car,
			boolean fireball, boolean persuasao, boolean curaFeitico) {
		
		super(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car);
		
		this.fireball = fireball;
		this.persuasao = persuasao;
		this.curaFeitico = curaFeitico;
		
	}

  
	// habilidades unicas de mago
	private boolean fireball;
	private boolean persuasao;
	private boolean curaFeitico;
	
	
	//Atributo de instância que será usado para a criação.
    private static Mago INSTANCIA;
	
    //Metódo que instancia um novo ladino apenas se não há uma instância já criada.
	public static Mago getInstancia(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
    int frc, int des, int con, int itl, int sab, int car,
    boolean fireball, boolean persuasao, boolean curaFeitico) {
    		if (INSTANCIA == null) {
    			INSTANCIA = new Mago(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car,
                fireball, persuasao, curaFeitico);
            }
            return INSTANCIA;
        }

	// getters and setters
	public boolean isFireball() {
		return fireball;
	}

	public void setFireball(boolean fireball) {
		this.fireball = fireball;
	}

	public boolean isPersuasao() {
		return persuasao;
	}

	public void setPersuasao(boolean persuasao) {
		this.persuasao = persuasao;
	}

	public boolean isCuraFeitico() {
		return curaFeitico;
	}

	public void setCuraFeitico(boolean curaFeitico) {
		this.curaFeitico = curaFeitico;
	}

	@Override
	public String toString() {
		String ficha;
		ficha = "Nome do Jogador: " + this.getNomePlayer() + "\nNome do Personagem: " + this.getNomeChar() + "\nIdade do Personagem: "
				+ this.getIdade() + "\nRaça: " + this.getRaca() + "\nPontos de vida: " + this.getPv() + "\nNível: "
				+ this.getNivel() + "\nForça: " + this.getFrc() + "\nDestreza: " + this.getDes() + "\nConstituição: " + this.getCon() + "\n Inteligência: " + this.getItl()
				+ "\nSabedoria: " + this.getSab() + "\nCarisma: " + this.getCar() + "\nTem a skill Bola de Fogo? " + isFireball()
				+ "\nTem a skill Persuasão?" + isPersuasao() + "\nTem a skill Feitiço de Cura? " + isCuraFeitico();
	return ficha;
	}
}