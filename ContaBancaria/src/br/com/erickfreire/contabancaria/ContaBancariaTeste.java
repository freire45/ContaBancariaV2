package br.com.erickfreire.contabancaria;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Erick Freire");
		ContaBancaria conta2 = new ContaBancaria("Maria Sila");
		
		System.out.printf("Cliente da Conta Bancária 1: %s%n", conta1.getNome());
		System.out.printf("Cliente da Conta Bancária 2: %s%n", conta2.getNome());

	}

}
