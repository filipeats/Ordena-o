import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[10];
		boolean troquei = true;
		
		// Preenchimento do vetor
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print("vetor[" + i + "]: ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Ordenação propriamente dita
		while (troquei) {
			troquei = false;
			
			for (int i = 0 ; i < 9 ; i++) { // Do primeiro ao penúltimo
				if (vetor[i] > vetor[i + 1]) {
					int temp = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = temp;
					
					troquei = true;
				}
			}
		}
		
		// Impressão do vetor ordenado
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(vetor[i]);
		}
	}
}