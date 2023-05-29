package br.ucsal.bes.poo20221.ted.domain;

public abstract class Personagem {
	public Personagem() {
	}
	
	public Personagem(String nomeChar, String nomePlayer, int idade, String raca, int pv, int nivel,
			int frc, int des, int con, int itl, int sab, int car) {
		this.nomeChar = nomeChar;
		this.nomePlayer = nomePlayer;
		this.idade = idade;
		this.raca = raca;
		this.pv = pv;
		this.nivel = nivel;

		this.frc = frc;
		this.des = des;
		this.con = con;
		this.itl = itl;
		this.sab = sab;
		this.car = car;
	}
	
	//caracteristicas basicas
	private String nomeChar;
	private String nomePlayer;
	private int idade;
	private String raca;
	private int pv; //pontos de vida
	private int nivel;
	
	//caracteristicas de habilidades basicas
	private int frc; //força
	private int des; //destreza
	private int con; //constituicao
	private int itl; //inteligencia
	private int sab; //sabedoria
	private int car; //carisma
	
	public String PrincipalAtaque;

	public String getNomeChar() {
		return nomeChar;
	}

	public void setNomeChar(String nomeChar) {
		this.nomeChar = nomeChar;
	}

	public String getNomePlayer() {
		return nomePlayer;
	}

	public void setNomePlayer(String nomePlayer) {
		this.nomePlayer = nomePlayer;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		this.pv = pv;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getFrc() {
		return frc;
	}

	public void setFrc(int frc) {
		this.frc = frc;
	}

	public int getDes() {
		return des;
	}

	public void setDes(int des) {
		this.des = des;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getItl() {
		return itl;
	}

	public void setItl(int itl) {
		this.itl = itl;
	}

	public int getSab() {
		return sab;
	}

	public void setSab(int sab) {
		this.sab = sab;
	}

	public int getCar() {
		return car;
	}

	public void setCar(int car) {
		this.car = car;
	}

}