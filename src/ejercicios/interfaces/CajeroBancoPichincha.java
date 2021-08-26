package ejercicios.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz {

	@Override
	public void solicitarTarjeta(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Ingresar tarjeta");
		System.out.println("Validar tarjeta");
		System.out.println("Consultar si la tarjeta ingresada es del banco Pichincha");
		
	}

	@Override
	public void solicitarClave(String clave) {
		// TODO Auto-generated method stub
		System.out.println("Ingresar la clave de acceso");
		System.out.println("Consultar en la base de datos");
		System.out.println("Comparar claves");
		System.out.println("Verificar si la clave es correcta");
		
	}

	@Override
	public void solicitarTipoTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Ingresar tipo de transaccion que desea realizar");
		System.out.println("Confirmar datos de usuario");
		System.out.println("Solicitar nuevamente la contraseña");
		
	}

	@Override
	public void solicitarMonto(int monto) {
		// TODO Auto-generated method stub
		System.out.println("Solicitar un monto");
		System.out.println("Solicitar un monto dentro del límite");
		System.out.println("Solicitar monto entero");
		
	}

	@Override
	public void validarElSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Validar saldo");
		System.out.println("Validar información del cliente");
		System.out.println("Restar el monto a retirar");
		System.out.println("Registrar saldo en la base de datos");
		
		
		
	}

	@Override
	public void entregarDinero() {
		// TODO Auto-generated method stub
		System.out.println("Entregar dinero");
		System.out.println("Hacer conteo de billetes");
		System.out.println("Entregar la cantidad señalada");
		System.out.println("Informar si no hay dinero");
		
		
	}

	@Override
	public void realizarLaTransaccion() {
		// TODO Auto-generated method stub
		System.out.println("Realizar la Transacción");
		System.out.println("Enviar datos de transaccion al receptor");
		System.out.println("Consultar en la base de datos si la transaccion fue exitosa");
		System.out.println("Informar si la transaccion se pudo realizar");
		
		
	}

	@Override
	public void entregarRecibo() {
		// TODO Auto-generated method stub
		System.out.println("Entregar recibo");
		System.out.println("Imprimir datos del cliente");
		System.out.println("Generar datos del proceso llevado a cabo");
	}

}
