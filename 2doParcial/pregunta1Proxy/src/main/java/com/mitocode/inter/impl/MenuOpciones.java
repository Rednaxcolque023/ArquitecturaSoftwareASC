package com.mitocode.inter.impl;

import com.mitocode.model.Viaje;
import com.mitocode.inter.IViaje;

public abstract class MenuOpciones implements IViaje {

	public Viaje aniadirPasajero(Viaje cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() - monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	public Viaje eliminarPasajer(Viaje cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() + monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	public void mostrarPasajero(Viaje cuenta) {
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
	}

}
