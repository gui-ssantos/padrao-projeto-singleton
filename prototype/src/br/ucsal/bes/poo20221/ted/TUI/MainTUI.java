package br.ucsal.bes.poo20221.ted.TUI;

import java.util.Scanner;
import br.ucsal.bes.poo20221.ted.domain.Personagem;
import br.ucsal.bes.poo20221.ted.exceptions.ValorIncorretoException;
import br.ucsal.bes.poo20221.ted.persistence.PersonagemDAO;

public class MainTUI {

	public static void main(String[] args) {
		menuPrincipal();
	}

	private static void menuPrincipal() {
		Scanner ent = new Scanner(System.in);
		
		print("Bem vindo ao RPG Ficha Generator!"
				+ "\nO que deseja fazer?"
				+ "\n\n  1) Criar a ficha do personagem"
				+   "\n  2) Imprimir fichas criadas");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				print("Abrindo menu de cria��o de ficha...\n");
				criarPersonagem();
				menuPrincipal();
				break;
			case 2:
					print("Imprimindo fichas...\n\n");
					imprimirFichas();
					System.out.println();
				break;
			default:
				throw new ValorIncorretoException("Valor inserido incorretamente, insira um n�mero entre 1 e 2.");
				}
			} catch (ValorIncorretoException e) {
				System.out.println(e.getMessage());
				menuPrincipal();
			}
		}

	private static void imprimirFichas() {
		for (Personagem a : PersonagemDAO.getLista()) {
			print(a);
		}
	}

	private static void criarPersonagem() {
		print("Qual a classe do personagem que deseja criar?");
		try {
			escolhaClasse();
		} catch (ValorIncorretoException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void escolhaClasse() throws ValorIncorretoException {
		Scanner ent = new Scanner(System.in);
		print("Escolha aa classe digitando o respectivo n�mero:\n1) B�rbaro\n2) Ladino\n3) Mago\n4) Ranger");
		int escolha = ent.nextInt();
		try {
			switch (escolha) {
			case 1:
				BarbaroTUI.criacaoPrincipal();
				break;
			case 2:
				LadinoTUI.criacaoPrincipal();
				break;
			case 3:
				MagoTUI.criacaoPrincipal();
				break;
			case 4:
				RangerTUI.criacaoPrincipal();
				break;
			default:
			 	throw new ValorIncorretoException("Valor incorretamente informado, insira um n�mero entre 1 e 4.");
			}
		} catch (ValorIncorretoException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void print(String string) {
		System.out.println(string);
	}

	private static void print(Personagem a) {
		System.out.println(a);
	}
}