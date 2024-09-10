package exercicio;

public class Fibonacci {

	public static void main(String[] args) {
		int numero = 100;
		int i = 0;

		System.out.println("Sequência de Fibonacci até 100:");
		while (true) {
			int fib = fibonacci(i);
			if (fib > numero)
				break;
			System.out.print(fib + " ");
			i++;
		}
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}