import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LAB1 {

	static Random meuGerador = new Random();

	public static int sortearInt(int menor, int maior) {
		return meuGerador.nextInt(maior * 10 - menor + 1) + menor;
	}

	public static int obterTamanhoIntersecao(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {

		int intersecoes = 0;
		for (int index1 = 0; index1 < lista1.size(); index1++) {
			for (int index2 = 0; index2 < lista2.size(); index2++) {
				if (lista1.get(index1) == lista2.get(index2)) {
					System.out.println("O número " + lista1.get(index1) + " se repete em ambas as listas, nas posições "
							+ (index1 + 1) + " e " + (index2 + 1) + ", respectivamente ");
					intersecoes++;

				}
			}
		}
		return intersecoes;
	}

	public static void main(String[] args) {
		int continuar = 0;
		while (continuar == 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o tamanho da Primeira lista :");
			int tamanho1 = scanner.nextInt();
			System.out.println("Digite o tamanho da Segunda lista : ");
			int tamanho2 = scanner.nextInt();
			ArrayList<Integer> lista1 = new ArrayList<Integer>(tamanho1);
			ArrayList<Integer> lista2 = new ArrayList<Integer>(tamanho2);
			for (int Contador = 0; Contador < tamanho1; Contador++) {
				int numero = sortearInt(0, tamanho1);
				lista1.add(numero);
			}
			for (int Contador = 0; Contador < tamanho2; Contador++) {
				int numero = sortearInt(0, tamanho2);
				lista2.add(numero);
			}
			System.out.println("Lista 1: " + lista1);
			System.out.println("Lista 2: " + lista2);

			int intersecao = obterTamanhoIntersecao(lista1, lista2);
			if (intersecao > 1) {
				System.out.println("As listas tem  " + intersecao + " interseções entre elas");
			} else if (intersecao == 1) {
				System.out.println("As listas tem  " + intersecao + " interseção entre elas");
			} else {
				System.out.println("As listas não possuem interseções entre si");
			}
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("Deseja verificar novamente com outras listas?");
			System.out.println("Digite (0) caso sim e outro caracterer caso deseje encerrar");
			continuar = scanner2.nextInt();
		}
		 
	}
}