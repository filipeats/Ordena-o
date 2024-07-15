import java.util.Scanner;

public class BuscaBinaria {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[2000000000];
		
		int busca = 0;
		int achei = 0;
		int inicio = 0;
		int fim = 0;
		int meio = 0;
		
		// Criação ordenada do vetor
		for (int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = i;
		}
		
		do {
			achei = -1;
			
			// Descobrir o parâmetro de busca
			System.out.print("Digite o valor a ser buscado: ");
			busca = leitor.nextInt();
			
			// Busca propriamente dita
			inicio = 0;
			fim = (vetor.length - 1);
			while (fim >= inicio) {
				meio = ((inicio + fim) / 2);
				
				if (vetor[meio] == busca) {
					achei = meio;
					break;
				} else if (vetor[meio] > busca) {
					fim = (meio - 1);
				} else {
					inicio = (meio + 1);
				}
			}
			if (achei == -1) {
				System.out.println("Me fodi ! Não achei !");
			} else {
				System.out.println("ACHEI !!! Na posição " + achei);
			}
		} while (busca != -99);
		
		leitor.close();
	}
}