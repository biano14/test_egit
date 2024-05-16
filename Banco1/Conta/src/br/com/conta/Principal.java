package br.com.conta;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ContaCorrente usuario = new ContaCorrente();
		ContaPoupanca usuario = new contaPoupanca();
		
		// entrada de dados da pessoa fisica
		System.out.println("Informe o nome: ");
		usuario.nome = leia.nextLine();
		System.out.println("Informe sua agencia: ");
		usuario.agencia = leia.nextLine();
		System.out.println("Informe sua contacorrente: ");
		usuario.contacorrente = leia.nextLine();
		
		

	}

}
