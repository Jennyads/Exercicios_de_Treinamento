import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
// Ler um número inteiro N e calcular todos os seus divisores

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
