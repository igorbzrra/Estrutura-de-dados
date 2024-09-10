package exercicio;

import java.util.Stack;

public class Palindromo {

	public static void main(String[] args) {
		String palavra = "radar"; // Insira a palavra a ser verificada
		if (ehPalindromo(palavra)) {
			System.out.println(palavra + " é um palíndromo.");
		} else {
			System.out.println(palavra + " não é um palíndromo.");
		}
	}

	public static boolean ehPalindromo(String palavra) {
		Stack<Character> pilha = new Stack<>();


		for (int i = 0; i < palavra.length(); i++) {
			pilha.push(palavra.charAt(i));
		}


		for (int i = 0; i < palavra.length(); i++) {
			if (palavra.charAt(i) != pilha.pop()) {
				return false;
			}
		}
		return true;
	}
}