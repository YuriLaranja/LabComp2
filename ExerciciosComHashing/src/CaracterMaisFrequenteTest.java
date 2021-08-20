import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaracterMaisFrequenteTest {
	
	@Test
	public void testarCaracterMaisFrequenteQuadratico() {
		long inicio, fim = 0;
		inicio = System.currentTimeMillis();
		assertEquals('a', CaracterMaisFrequente.encontrarCaracterMaisFrequenteQuadratico("arara"));
		assertEquals(' ', CaracterMaisFrequente.encontrarCaracterMaisFrequenteQuadratico("a r a r a 345 sdf hhh"));
		fim = System.currentTimeMillis() - inicio;
		System.out.printf("Duração quadratico: %.15f segundos\n", fim / 1000f);
	}

	@Test
	public void testarCaracterMaisFrequente() {
		long inicio, fim = 0;
		inicio = System.currentTimeMillis();
		assertEquals('a', CaracterMaisFrequente.encontrarCaracterMaisFrequente("arara"));
		assertEquals(' ', CaracterMaisFrequente.encontrarCaracterMaisFrequente("a r a r a 345 sdf hhh"));
		fim = System.currentTimeMillis() - inicio;
		System.out.printf("Duração linear: %.15f segundos\n", fim / 1000f);
	}

}