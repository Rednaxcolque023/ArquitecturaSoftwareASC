package com.mitocode;

import com.mitocode.inter.impl.MenuOpciones;
import com.mitocode.model.Viaje;
import com.mitocode.proxy.ViajeProxy;
import com.mitocode.inter.IViaje;

public class App {

	public static void main(String[] args) {
		Viaje c = new Viaje(1, "mitocode", 100);
		
		IViaje cuentaProxy = new ViajeProxy(new MenuOpciones());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
		
	}

}
