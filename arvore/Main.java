package arvore;

public class Main {

	    public static void main(String[] args) {
	        ArvoreBinaria arvore = new ArvoreBinaria();
	        arvore.adicionar(10);
	        arvore.adicionar(5);
	        arvore.adicionar(15);
	        arvore.adicionar(2);
	        arvore.adicionar(7);
	        arvore.adicionar(12);
	        arvore.adicionar(20);

	        int altura = arvore.altura(arvore.raiz);
	        System.out.println("A altura da árvore é: " + altura);
	    }
	}