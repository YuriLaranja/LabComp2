import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SomaDoParTest {

    private ArrayList<Integer> lista;

    @Before
    public void setUp() {
        int[] array = new int[] {1, 45, -8, 50, 12, 900, -7, 4, 49};
        lista = new ArrayList<>();
        for (int elemento : array) {
            lista.add(elemento);
        }
    }

    @Test
    public void testarSomaDoParQuandoEncontra() {
    	long inicio, fim = 0;
    	inicio=System.currentTimeMillis();
        assertEquals(Integer.valueOf(-8), SomaDoPar.encontrarParComSomaDada(lista, 4));
        assertEquals(Integer.valueOf(4), SomaDoPar.encontrarParComSomaDada(lista, 53));
        fim = System.currentTimeMillis() - inicio;
    	System.out.printf("Duração linear: %.50f segundos\n", fim/1000f);
    }

    @Test
    public void testarSomaDoParQuandoNaoEncontra() {
    	long inicio, fim = 0;
    	inicio=System.currentTimeMillis();
        assertNull(SomaDoPar.encontrarParComSomaDada(lista, 1000000));
        assertNull(SomaDoPar.encontrarParComSomaDada(lista, 1));
        assertNull(SomaDoPar.encontrarParComSomaDada(lista, 0));
        fim = System.currentTimeMillis() - inicio;
    	System.out.printf("Duração linear: %.50f segundos\n", fim/1000f);
    }
    @Test
    public void testarSomaDoParQuandoEncontraQuadratico() {
    	long inicio, fim;
    	inicio=System.currentTimeMillis();
        assertEquals(Integer.valueOf(-8), SomaDoPar.encontrarParComSomaDadaQuadratico(lista, 4));
        assertEquals(Integer.valueOf(4), SomaDoPar.encontrarParComSomaDadaQuadratico(lista, 53));
        fim = System.currentTimeMillis() ;
    	System.out.println("Duração quadratico: %.50f segundos\n" +fim +" " + inicio);
    }

    @Test
    public void testarSomaDoParQuandoNaoEncontraQuadratico() {
    	long inicio, fim = 0;
    	inicio=System.currentTimeMillis();
        assertNull(SomaDoPar.encontrarParComSomaDadaQuadratico(lista, 1000000));
        assertNull(SomaDoPar.encontrarParComSomaDadaQuadratico(lista, 1));
        assertNull(SomaDoPar.encontrarParComSomaDadaQuadratico(lista, 0));
        fim = System.currentTimeMillis() - inicio;
    	System.out.printf("Duração quadratico: %.3f segundos\n", fim/1000f);
    }



}