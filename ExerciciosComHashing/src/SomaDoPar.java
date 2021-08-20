import java.util.ArrayList;
import java.util.HashSet;

public class SomaDoPar {
	public static Integer encontrarParComSomaDadaQuadratico(
			
    /**
     * Percorre a lista dada para encontrar um par de elementos
     * cuja soma seja o valor desejado.
     *
     * @param numeros uma lista de inteiros
     * @param somaDesejada a soma desejada
     *
     * @return O menor dos elementos do par encontrado;
     *         ou null, caso nenhum par de elementos some o valor desejado
     */
            ArrayList<Integer> numeros, int somaDesejada) {

    //  Algoritmo ineficiente (quadrático):
		
        for (int i = 0; i < numeros.size(); i++) {
            for (int j = i + 1; j < numeros.size(); j++) {
                int x = numeros.get(i);
                int y = numeros.get(j);
                if (x + y == somaDesejada) {
                    return Math.min(x, y);
                }
            }
        }
       

        return null;  // ToDo IMPLEMENT ME!!!!
    }
    public static Integer encontrarParComSomaDada(
    	
        ArrayList<Integer> numeros, int somaDesejada) {
    	
    	HashSet<Integer> numerosHash = new HashSet<>();
    	int numeroDesejado;
    	
    	for (Integer elementonumero : numeros) {
            numerosHash.add(elementonumero); 
            numeroDesejado =  somaDesejada - elementonumero;
            if (numerosHash.contains(numeroDesejado)) return Math.min(elementonumero, numeroDesejado); 
                  // O(1)           
        }   	
    	 // O(n)
    	
    	return null;
    
    }
    }

