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

		print("Informe o nível do seu personagem:");
		int nivel = ent.nextInt();

		// leitor de atributos
		print("Insira o número da força do seu personagem: ");
		int frc = ent.nextInt();

		print("Insira o número da destreza do seu personagem: ");
		int des = ent.nextInt();

		print("Insira o número da constituição do seu personagem: ");
		int con = ent.nextInt();

		print("Insira o número da inteligência do seu personagem: ");
		int itl = ent.nextInt();

		print("Insira o número da sabedoria do seu personagem: ");
		int sab = ent.nextInt();

		print("Insira o número da carisma do seu personagem: ");
		int car = ent.nextInt();

		boolean esquivaN = temEsquivaN();
		boolean furia = temFuria();
		boolean reducaoDano = temReducaoDeDano();

		Barbaro barbaro = new Barbaro(nomeChar, nomePlayer, idade, raca, pv, nivel, frc, des, con, itl, sab, car,
				esquivaN, furia, reducaoDano);
		
		barbaro.setPrincipalAtaque("Prepare-se para ataques brutais!");
		
		PersonagemBO.cadastrarBarbaro(barbaro);
		
		print(barbaro.getPrincipalAtaque());
		
	}

	private static boolean temEsquivaN() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Esquiva Natural?" + "\n1) Sim" + "\n2) Não");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				throw new ValorIncorretoException("Valor incorretamente informado, insira um número entre 1 e 2.");
			}
		} catch (ValorIncorretoException e) {
			print("Valor incorretamente informado, insira um número entre 1 e 2.");
			temEsquivaN();
		}
		return en;
	}

	private static boolean temFuria() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Fúria?" + "\n1) Sim" + "\n2) Não");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				throw new ValorIncorretoException("Valor incorretamente informado, insira um número entre 1 e 2.");
			}
		} catch (ValorIncorretoException e) {
			print("Valor incorretamente informado, insira um número entre 1 e 2.");
			temFuria();
		}
		return en;
	}

	private static boolean temReducaoDeDano() {
		Scanner ent = new Scanner(System.in);
		boolean en = false;
		print("Seu personagem tem a habilidade Redução de Dano?" + "\n1) Sim" + "\n2) Não");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				return true;
			case 2:
				return false;
			default:
				throw new ValorIncorretoException("Valor incorretamente informado, insira um número entre 1 e 2.");
			}
		} catch (ValorIncorretoException e) {
			print("Valor incorretamente informado, insira um número entre 1 e 2.");
			temReducaoDeDano();
		}
		return en;
	}

	private static String escolherRaca() throws ValorIncorretoException {
		String raca;
		Scanner ent = new Scanner(System.in);
		print("Escolha a Raça digitando o respectivo número:" + "\n1) Humano" + "\n2) Elfo" + "\n3) Orc"
				+ "\n4) Anão");
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
			raca = "Anão";
			break;
		default:
			throw new ValorIncorretoException("Valor incorretamente informado, insira um número entre 1 e 4.");
		}
		return raca;
	}

	public static void print(String txt) {
		System.out.println(txt);
	}

}
