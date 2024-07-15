import java.util.Scanner;

public class BuscaExaustiva {
	public static void main(String[] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[] vetor = new int[1000000000];
		
		int busca = 0;
		int achei = 0;
		
		// Criar o vetor aleatoriamente
		for (int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = ((int) (vetor.length * Math.random()));
		}
		
		do {
			achei = -1;
			
			// Perguntar o parâmetro de busca
			System.out.print("Digite o valor a ser buscado " +
							 "ou -99 para sair: ");
			busca = leitor.nextInt();
			
			// Busca propriamente dita
			for (int i = 0 ; i < vetor.length ; i++) {
				if (vetor[i] == busca) {
					achei = i;
					break;
				}
			}
			if (achei == -1) {
				System.out.println("Me fodi ! Não achei !");
			} else {
				System.out.println("ACHEI !!!! Na posição " + achei);
			}
		} while (busca != -99);
		
		leitor.close();
	}
}