package com.bank;

import lombok.Getter;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Getter
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected List <Object[]> transacoes = new ArrayList<>();
	protected Cliente cliente;

	// Data Formatada
	protected LocalDateTime data = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String dataFormatada = data.format(formatter);

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente.");
		}else {
			saldo -= valor;
			transacao(valor);
		}
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		transacoes.add(new Object[]{+valor, saldo, dataFormatada});

	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	@Override
	public void transacao(double valor) {
		transacoes.add(new Object[]{-valor, saldo, dataFormatada});

	}

	protected void imprimirTransacoes() {
		System.out.println("Valor |  Saldo  |  Data");
		System.out.println();
		for (Object[] elemento : transacoes) {
			System.out.println(Arrays.toString(elemento));
		}
		System.out.println();
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo atual: %s", this.saldo));

	}
}
