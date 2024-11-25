package arvore;

public class Node {
	
	    int valor;
	    Node esquerda, direita;

	    // Construtor
	    public Node(int valor) {
	        this.valor = valor;
	        this.esquerda = null;
	        this.direita = null;
	    }
}