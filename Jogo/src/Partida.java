import java.util.Random;

public class Partida {
	 Random random = new Random();
	 int   numero = random.nextInt(2);
	int result;
	Jogador jog1, jog2;
	public  Partida(Jogador jogador1, Jogador jogador2) {
		jog1 = jogador1;
		jog2 = jogador2;
		result = getResultado(jogador1, jogador2);
			
	
	}
		
	
	
		public  int getResultado(Jogador jogador1, Jogador jogador2) {
		
		if (numero == 1) {
			return 1;
		} else if (numero == 2) {
			return 2;
		} else {
			return 0;
			
		}
	}
	}

	
