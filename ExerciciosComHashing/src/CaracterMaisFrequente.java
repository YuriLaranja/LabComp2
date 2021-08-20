import java.util.HashMap;
import java.util.Map;

public class CaracterMaisFrequente {

	
	 public static char encontrarCaracterMaisFrequenteQuadratico(String texto) {
		// Algoritmo ineficiente (quadrÃ¡tico):

       char maisFrequente = texto.charAt(0);
       int ocorrenciasDoMaisFrequente = 1;

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
		long inicio, fim = 0;
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char maisFrequente = texto.charAt(0);
		int ocorrenciasDoMaisFrequente = 1;
		   inicio=System.currentTimeMillis();
		for (int i = 0; i < texto.length(); i++) {

			if (map.containsKey(texto.charAt(i))) {
				int j = map.get(texto.charAt(i));
				map.put(texto.charAt(i), j + 1);
			} else map.put(texto.charAt(i), 1);
		
		}
		for (Character letra : map.keySet()) {
			if (map.get(letra) > ocorrenciasDoMaisFrequente) {
				maisFrequente = letra;
				ocorrenciasDoMaisFrequente = map.get(letra);
			}
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo necessário método hashMap : %.5lf " + (fim-inicio));
		return maisFrequente;

		// ToDo IMPLEMENT ME!!!!

	}
}
