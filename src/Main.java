import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Conta> list = new ArrayList<>();
		Cliente ellisson = new Cliente();
		ellisson.setNome("Ellisson Mateus");
		
		Cliente joao = new Cliente();
		joao.setNome("João Maria");
		
		Conta cc = new ContaCorrente(ellisson);
		Conta poupanca = new ContaPoupanca(ellisson);
		
		Conta contaC = new ContaCorrente(joao);
		Conta contaP = new ContaPoupanca(joao);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		contaC.depositar(1500);
		contaC.transferir(560, contaP);
		
		cc.imprimirExrtato();
		poupanca.imprimirExrtato();
		
		contaC.imprimirExrtato();
		contaP.imprimirExrtato();
		
		list.add(cc);
		list.add(poupanca);
		list.add(contaC);
		list.add(contaP);
		Banco caixa = new Banco();
		caixa.setContas(list);
		caixa.listarContas();
	}
}
