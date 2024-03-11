package com.bank;

public class Main {

	public static void main(String[] args) {
		Cliente caio = new Cliente("Caio Arruda", "123.456.789-10");

		
		Conta cc = new ContaCorrente(caio);
		Conta poupanca = new ContaPoupanca(caio);

		cc.depositar(100);
		cc.depositar(1250);
		cc.sacar(250);
		cc.transferir(350, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
