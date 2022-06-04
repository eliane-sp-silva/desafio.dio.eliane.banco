package desafio.dio.eliane.banco;

public abstract class Conta implements IConta {
	//classe abstrata não pode ser instanciada com exceção das classes filhos
		private static final int AGENCIA_PADRAO = 1;
	private static final IConta ContaUniversitaria = null;
		private static int SEQUENCIAL = 1;

		protected int agencia; //atributo
		protected int numero;
		protected double saldo;
		protected double juros = 0.15;
		protected Cliente cliente;
		

		public Conta(Cliente cliente) {
			this.agencia = Conta.AGENCIA_PADRAO;
			this.numero = SEQUENCIAL++;
			this.cliente = cliente;
		}

		@Override
		public void sacar(double valor) {
			saldo -= valor; //metodo
			}

		@Override
		public void depositar(double valor) {
			saldo += valor;
		}

		@Override
		public void transferir(double valor, IConta contaDestino) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		
		public int getAgencia() {
			return agencia;
		}

		public int getNumero() {
			return numero;
		}

		public double getSaldo() {
			return saldo;
		}

		protected void imprimirInfosComuns() {
			System.out.println(String.format("Titular: %s", this.cliente.getNome()));
			System.out.println(String.format("Agencia: %d", this.agencia));
			System.out.println(String.format("Numero: %d", this.numero));
			System.out.println(String.format("Saldo: %.2f", this.saldo));
		}
}
