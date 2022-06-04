package desafio.dio.eliane.banco;

public class ContaPoupanca extends Conta{
	//extends = herda da classe pai = herança

		public ContaPoupanca(Cliente cliente) {
			super(cliente);
			//super = classe pai
		}

		@Override
		public void imprimirExtrato() {
			System.out.println("=== Extrato Conta Poupança ===");
			super.imprimirInfosComuns();
		}
}
