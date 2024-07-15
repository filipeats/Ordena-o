import java.util.Scanner;

public class OrdenacaoDireta {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		// Preenchimento do vetor
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print("Digite o valor da posição " +
							 i + " do vetor: ");
			vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Ordenação propriamente dita
		for (int i = 0 ; i < 9 ; i++) { // Do primeiro ao penúltimo
			for (int j = (i + 1) ; j < 10 ; j++) { // Do próximo ao último
				if (vetor[i] > vetor[j]) {
					int temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
			}
		}
		
		// Impressão do vetor
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(vetor[i]);
		}
	}
}