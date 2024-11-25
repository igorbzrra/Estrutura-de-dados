package arvore;

public class ArvoreBinaria {

	    Node raiz;

	    public int altura(Node node) {
	        if (node == null) {
	            return -1;
	        }

	        int alturaEsquerda = altura(node.esquerda);
	        int alturaDireita = altura(node.direita);

	        return Math.max(alturaEsquerda, alturaDireita) + 1;
	    }

	    public void adicionar(int valor) {
	        raiz = adicionarRecursivo(raiz, valor);
	    }

	    private Node adicionarRecursivo(Node node, int valor) {
	        if (node == null) {
	            return new Node(valor);
	        }

	        if (valor < node.valor) {
	            node.esquerda = adicionarRecursivo(node.esquerda, valor);
	        } else if (valor > node.valor) {
	            node.direita = adicionarRecursivo(node.direita, valor);
	        }

	        return node;
	    }
	}