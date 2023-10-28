package common;

import java.util.List;

public interface IOperaciones {
	
	List<Object> retirar(Cuenta origen, double monto);
	Ticket depositar(Cuenta destino, double monto);
	Ticket transferir(Cuenta origen, Cuenta destino, double monto);
}
