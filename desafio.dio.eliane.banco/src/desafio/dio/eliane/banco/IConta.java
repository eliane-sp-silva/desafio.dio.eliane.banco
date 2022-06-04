package desafio.dio.eliane.banco;

public interface IConta {
	//interface = classe abstrata com todos os métodos abstratos , obriga a classe que implementar a interface tudo que tem, assinatura de métodos
		//que as classes terão que respeitar. Essa interface não era necessária, foi feita somente para exemplificação de uso.
		
		
		void sacar(double valor);
		
		void depositar(double valor);
		
		void transferir(double valor, IConta contaDestino);		
					
		void imprimirExtrato();
	
}
