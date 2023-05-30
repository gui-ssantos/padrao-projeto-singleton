package br.ucsal.bes.poo20221.ted.TUI;

import java.util.Scanner;
import br.ucsal.bes.poo20221.ted.domain.Ranger;
import br.ucsal.bes.poo20221.ted.exceptions.ValorIncorretoException;
import br.ucsal.bes.poo20221.ted.domain.Personagem;
import br.ucsal.bes.poo20221.ted.business.PersonagemBO;

public class RangerTUI {

	public static void criacaoPrincipal() {
		Scanner ent = new Scanner(System.in);

		print("Informe seu Nome");
		String nomePlayer = ent.nextLine();

		print("Informe o nome do seu personagem:");
		String nomeChar = ent.nextLine();

		print("Informe sua idade:");
		int idade = ent.nextInt();

		String raca = "";
		try {
			raca = escolherRaca();
		} catch (ValorIncorretoException e) {
			print("Valor informado de forma incorreta, escolha uma op��o entre 1 e 4");
		}

		print("Informe os pontos de vida do seu personagem:");
		int pv = ent.nextInt();

		print("Informe o n�vel do seu personagem:");
		int nivel = ent.nextInt();

		// leitor de atributos
		print("Insira o n�mero da for�a do seu personagem: ");
		int frc = ent.nextInt();

		print("Insira o n�mero da destreza do seu personagem: ");
		int des = ent.nextInt();

		print("Insira o n�mero da constitui��o do seu personagem: ");
		int con = ent.nextInt();

		print("Insira o n�mero da intelig�ncia do seu personagem: ");
		int itl = ent.nextInt();

		print("Insira o n�mero da sabedoria do seu personagem: ");
		int sab = ent.nextInt();

		print("Insira o n�mero da carisma do seu personagem: ");
		int car = ent.nextInt();

		boolean rastreadorEficaz = temRastreadorEficaz();
		boolean rastroInvisivel = temRastroInvisivel();
		boolean camuflagem = temCamuflagem();

		//Apenas um objeto dessa classe é criado com o getInstancia. Ao tentar criar outro, o primeiro objeto permanecerá como único.
		Ranger ranger = Ranger.getInstancia(nomeChar, nomePlayer, idade, raca,
		pv, nivel, frc, des, con, itl, sab, car, rastreadorEficaz, rastroInvisivel, camuflagem);
		
		PersonagemBO.cadastrarRanger(ranger);
		

	}

	private static boolean temRastreadorEficaz() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Rastreador Eficaz?" + "\n1) Sim" + "\n2) N�o");
		int escolha1 = ent.nextInt();
		try {
			switch (escolha1) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				throw new ValorIncorretoException("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			}
		} catch (ValorIncorretoException e) {
			print("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			temRastreadorEficaz();
		}
		return en;
	}

	private static boolean temRastroInvisivel() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Rastro Invis�vel?" + "\n1) Sim" + "\n2) N�o");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				throw new ValorIncorretoException("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			}
		} catch (ValorIncorretoException e) {
			print("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			temRastroInvisivel();
		}
		return en;
	}

	private static boolean temCamuflagem() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade de Camuflagem?" + "\n1) Sim" + "\n2) N�o");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				throw new ValorIncorretoException("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			}
		} catch (ValorIncorretoException e) {
			print("Valor incorretamente informado, insira um n�mero entre 1 e 2.");
			temCamuflagem();
		}
		return en;
	}

	private static String escolherRaca() throws ValorIncorretoException {
		String raca;
		Scanner ent = new Scanner(System.in);
		print("Escolha a Ra�a digitando o respectivo n�mero:" + "\n1) Humano" + "\n2) Elfo" + "\n3) Orc"
				+ "\n4) An�o");
		int escolha = ent.nextInt();
		switch (escolha) {
		case 1:
			raca = "Humano";
			break;
		case 2:
			raca = "Elfo";
			break;
		case 3:
			raca = "Orc";
			break;
		case 4:
			raca = "An�o";
			break;
		default:
			throw new ValorIncorretoException("Valor incorretamente informado, insira um n�mero entre 1 e 4.");
		}
		return raca;
	}

	public static void print(String txt) {
		System.out.println(txt);
	}

}
