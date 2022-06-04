package desafio.dio.eliane.banco;

public class ContaUniversitaria extends Conta {
	public ContaUniversitaria(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Universitária ===");
		super.imprimirInfosComuns();
	}
}
