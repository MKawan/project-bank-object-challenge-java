
public class Main {

	public static void main(String[] args) {
		Cliente mkawan = new Cliente();
		mkawan.setNome("MKawan");
		
		Conta cc = new ContaCorrente(mkawan);
		Conta poupanca = new ContaPoupanca(mkawan);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
