import java.util.HashMap;
import java.util.Map;

public class CaracterMaisFrequente {

	public static char encontrarCaracterMaisFrequenteQuadratico(String texto) {
		// Algoritmo ineficiente (quadr√°tico):

		char maisFrequente = texto.charAt(0);
		int ocorrenciasDoMaisFrequente = 1;
		String sequencia = "abcdefghijkaaaa";
		//teste verificar algoritmo mais r·pido
		if (texto.charAt(1) != ' ') {
			for (int i = 0; i < 1000; i++) {
				texto = texto + sequencia;
			}
		}

		for (int i = 0; i < texto.length(); i++) {
			char caracterDaVez = texto.charAt(i);
			int contOcorrencias = 1;
			for (int j = i + 1; j < texto.length(); j++) {
				if (texto.charAt(j) == caracterDaVez) {
					contOcorrencias++;
				}
			}

			if (contOcorrencias > ocorrenciasDoMaisFrequente) {
				maisFrequente = caracterDaVez;
				ocorrenciasDoMaisFrequente = contOcorrencias;
			}

		}

		return maisFrequente;
	}

	// Algoritmo eficiente (linear):
	public static char encontrarCaracterMaisFrequente(String texto) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char maisFrequente = texto.charAt(0);
		int ocorrenciasDoMaisFrequente = 1;
		String sequencia = "abcdefghijkaaaa";
		//teste verificar algoritmo mais r·pido
		if (texto.charAt(1) != ' ') {
			for (int i = 0; i < 1000; i++) {
				texto = texto + sequencia;
			}
		}

		for (int i = 0; i < texto.length(); i++) {

			if (map.containsKey(texto.charAt(i))) {
				int j = map.get(texto.charAt(i));
				map.put(texto.charAt(i), j + 1);
			} else
				map.put(texto.charAt(i), 1);

		}
		for (Character letra : map.keySet()) {
			if (map.get(letra) > ocorrenciasDoMaisFrequente) {
				maisFrequente = letra;
				ocorrenciasDoMaisFrequente = map.get(letra);
			}
		}

		return maisFrequente;

		// ToDo IMPLEMENT ME!!!!

	}
}
