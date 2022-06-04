package desafio.dio.eliane.banco;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Eliane");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);	
		

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println("");
		System.out.println("=== Próximo Cliente ===");
	
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Juliana");
		
		Conta contaUniversitaria = new ContaUniversitaria(cliente2);
		contaUniversitaria.depositar(500);
		contaUniversitaria.sacar(100);
		contaUniversitaria.imprimirExtrato();
		
		System.out.println("");
		System.out.println("=== Próximo Cliente ===");
		
		Cliente cliente3 = new Cliente();
		cliente3.setNome("Francisco");
		
		Conta contaPoupanca = new ContaPoupanca(cliente3);
		contaPoupanca.depositar(800);
		contaPoupanca.sacar(300);
		contaPoupanca.imprimirExtrato();	

	}

}
