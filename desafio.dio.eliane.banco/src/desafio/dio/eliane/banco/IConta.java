package desafio.dio.eliane.banco;

public interface IConta {
	//interface = classe abstrata com todos os m�todos abstratos , obriga a classe que implementar a interface tudo que tem, assinatura de m�todos
		//que as classes ter�o que respeitar. Essa interface n�o era necess�ria, foi feita somente para exemplifica��o de uso.
		
		
		void sacar(double valor);
		
		void depositar(double valor);
		
		void transferir(double valor, IConta contaDestino);		
					
		void imprimirExtrato();
	
}
