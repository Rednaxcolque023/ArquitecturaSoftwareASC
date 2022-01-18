package com.mitocode.inter;

import com.mitocode.model.Viaje;

public interface IViaje{

	Viaje retirarDinero(Viaje cuenta, double monto);
	Viaje depositarDinero(Viaje cuenta, double monto);
	void mostrarSaldo(Viaje cuenta);
}
