
public class ContaCorrente extends Conta {

	
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExrtato() {
		System.out.println("\n=== Extrato Conta Corrente ===\n");
		super.imprimirInfosComuns();
	}
}
