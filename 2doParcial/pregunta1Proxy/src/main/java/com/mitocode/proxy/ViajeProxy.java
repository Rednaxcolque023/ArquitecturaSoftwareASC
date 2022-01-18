package com.mitocode.proxy;

import java.util.logging.Logger;

import com.mitocode.inter.impl.MenuOpciones;
import com.mitocode.model.Viaje;
import com.mitocode.inter.IViaje;

public class ViajeProxy implements IViaje {

	private IViaje cuentaReal;
	private final static Logger LOGGER = Logger.getLogger(ViajeProxy.class.getName());

	public ViajeProxy(IViaje cuentaReal) {
		this.cuentaReal = cuentaReal;
	}
	
	@Override
	public Viaje elimnarPasajero(Viaje cuenta, double monto) {
		LOGGER.info("----Viaje Proxy -Eliminar Pasajero----");
		if (cuentaReal == null) {
			cuentaReal = new MenuOpciones();
			return cuentaReal.retirarDinero(cuenta, monto);
		} else {
			return cuentaReal.retirarDinero(cuenta, monto);
		}
	}

	@Override
	public Viaje aniadirPasajero(Viaje cuenta, double monto) {
		LOGGER.info("----Cuenta Proxy - Depositar Dinero----");
		if (cuentaReal == null) {
			cuentaReal = new MenuOpciones();
			return cuentaReal.depositarDinero(cuenta, monto);
		} else {
			return cuentaReal.depositarDinero(cuenta, monto);
		}
	}

	@Override
	public void mostrarPasajero(Viaje cuenta) {
		LOGGER.info("----Cuenta Proxy - Mostrar Dinero----");
		if (cuentaReal == null) {
			cuentaReal = new MenuOpciones();
			cuentaReal.mostrarSaldo(cuenta);
		} else {
			cuentaReal.mostrarSaldo(cuenta);
		}
	}

}
