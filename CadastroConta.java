import java.util.ArrayList;
import java.util.List;

public class CadastroConta {

	private List<Conta> conta;

	        conta = new ArrayList<>();

	public void adicionarConta(Conta conta) {
		conta.add(conta);
	}

	public void listarConta() {
		for (Conta conta : conta) {
			System.out.println("Nome: " + conta.getNome() + ", Saldo: " + conta.getValor());
		}
	}

	public Conta procurarConta(String nome) {
		for (Conta conta : conta) {
			if (conta.getNome().equalsIgnoreCase(nome)) {
				return conta;
			}
		}
		return null;
	}

}
