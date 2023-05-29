package br.ucsal.bes.poo20221.ted.business;

import br.ucsal.bes.poo20221.ted.persistence.PersonagemDAO;
import br.ucsal.bes.poo20221.ted.domain.Barbaro;
import br.ucsal.bes.poo20221.ted.domain.Ladino;
import br.ucsal.bes.poo20221.ted.domain.Mago;
import br.ucsal.bes.poo20221.ted.domain.Personagem;
import br.ucsal.bes.poo20221.ted.domain.Ranger;

public class PersonagemBO {

	public static void cadastrarBarbaro(Personagem barbaro) {
		PersonagemDAO.inserirPersonagem(barbaro);
	}

	public static void cadastrarLadino(Personagem ladino) {
		PersonagemDAO.inserirPersonagem(ladino);
	}

	public static void cadastrarMago(Personagem mago) {
		PersonagemDAO.inserirPersonagem(mago);
	}

	public static void cadastrarRanger(Personagem ranger) {
		PersonagemDAO.inserirPersonagem(ranger);
	}
}

