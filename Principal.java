package exercicio2;

public class Principal {

	public static void main(String[] args) {
		CadastroConta banco = new CadastroConta();


		Conta conta1 = new Conta("João", 1000.0);
		Conta conta2 = new Conta("Maria", 2000.0);

		banco.adicionarConta(conta1);
		banco.adicionarConta(conta2);

		banco.listarConta();

		String nomeBusca = "Maria";
		Conta contaEncontrada = banco.procurarConta(nomeBusca);
		if (contaEncontrada != null) {
			System.out.println(
					"Conta encontrada: " + contaEncontrada.getNome() + ", Saldo: " + contaEncontrada.getValor());
		} else {
			System.out.println("Conta não encontrada para o nome: " + nomeBusca);
		}
	}
}
