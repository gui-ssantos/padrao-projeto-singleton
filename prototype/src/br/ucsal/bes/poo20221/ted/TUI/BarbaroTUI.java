package br.ucsal.bes.poo20221.ted.TUI;

import java.util.Scanner;
import br.ucsal.bes.poo20221.ted.domain.Barbaro;
import br.ucsal.bes.poo20221.ted.exceptions.ValorIncorretoException;
import br.ucsal.bes.poo20221.ted.business.PersonagemBO;

public class BarbaroTUI {

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
			System.out.println(e.getMessage());
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

		boolean esquivaN = temEsquivaN();
		boolean furia = temFuria();
		boolean reducaoDano = temReducaoDeDano();

		//Apenas um objeto dessa classe é criado com o getInstancia. Ao tentar criar outro, o primeiro objeto permanecerá como único.
		Barbaro barbaro = Barbaro.getInstancia(nomeChar, nomePlayer, idade, raca,
		pv, nivel, frc, des, con, itl, sab, car, esquivaN, furia, reducaoDano);
		
		
		PersonagemBO.cadastrarBarbaro(barbaro);
		

		
	}

	private static boolean temEsquivaN() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Esquiva Natural?" + "\n1) Sim" + "\n2) N�o");
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
			temEsquivaN();
		}
		return en;
	}

	private static boolean temFuria() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade F�ria?" + "\n1) Sim" + "\n2) N�o");
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
			temFuria();
		}
		return en;
	}

	private static boolean temReducaoDeDano() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Redu��o de Dano?" + "\n1) Sim" + "\n2) N�o");
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
			temReducaoDeDano();
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
