import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void listarContas() {
		System.out.println("\n          === Contas ===          \n");
		for (Conta conta : contas) {
			System.out.println("--------------------------------------");
			System.out.printf("Titular: %s\n",conta.getCliente().getNome());
			System.out.printf("Agencia: %d\n",conta.getAgencia());
			System.out.printf("Número: %d\n",conta.getNumero());
			System.out.println("Saldo: --");
			System.out.println();
		}
		System.out.println("--------------------------------------");
		System.out.println("          =======X=======         ");
	}
}
