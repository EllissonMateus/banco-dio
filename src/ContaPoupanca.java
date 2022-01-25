
public class ContaPoupanca extends Conta{

	
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExrtato() {
		System.out.println("\n=== Extrato Conta Poupança ===\n");
		super.imprimirInfosComuns();
	}
}
