package br.ucsal.bes.poo20221.ted.persistence;

import java.util.ArrayList;
import java.util.List;
import br.ucsal.bes.poo20221.ted.domain.Personagem;

public class PersonagemDAO {
		
		private static List<Personagem> personagens = new ArrayList<>();
		
		public static void inserirPersonagem(Personagem personagem) {
			personagens.add(personagem);
		}
		public static List<Personagem> getLista() {
			return personagens;
		}
}