import java.util.ArrayList;

public class JogoOnline {

	public static ArrayList<Jogador> listaJogadores = new ArrayList<>();

	public static Jogador CadastrarJogador(String username, String senha) {
		Jogador novoJogador = new Jogador(username, senha);

		for (Jogador i : listaJogadores) {
			if (i.userName.equals(novoJogador.userName)) {
				
			}
		}

		listaJogadores.add(novoJogador);

		return novoJogador;
	}

	public static void Login(String username, String senha) throws UsuarioInexistenteException, SenhaInvalidaException {
		
		for (Jogador i : listaJogadores) {
			
			
			if (i.userName.equals(username)) {
				 if (i.senha.equals(senha)) {
					i.status = true;
					
				} else throw new SenhaInvalidaException() ;
					// senha errada
					
			}
		}
		
	}

	public static boolean Logout(Jogador jogador) {
		
		if (jogador.getStatus() == false) throw new RuntimeException("O Jogador precisa estar online");
		else {
			jogador.setStatus(false);
			return true;
		}
			
		}

	public static Partida IniciarPartida(Jogador jogador1, Jogador jogador2) {

		if (jogador1.getStatus() && jogador2.getStatus() && !jogador1.getJogando() && !jogador2.getJogando()) {

			jogador1.setJogando(true);
			jogador2.setJogando(true);
			Partida partida2 = new Partida(jogador1, jogador2);
			return partida2;
		}
		return null;
	}

	public static Jogador escolherAdversario(Jogador jogador1) {
		for (Jogador i : listaJogadores) {
			if (i.userName.equals(jogador1.userName)) {
				break;
			} else {
				if (i.getStatus() == true && i.getJogando() == false) {
					return i;

				}
			}
		}
		return null;

	}

	public static void encerrarPartida(Partida partida, int resultado) {
		resultado = partida.result;

		if (partida.result == 0) {
			partida.jog1.setJogando(false);
			partida.jog2.setJogando(false);
			partida.jog1.partidas.add(partida);
			partida.jog2.partidas.add(partida);
			

		}

		else if (partida.result == 1) {
			partida.jog1.setPontos(+1);
			partida.jog2.setPontos(-1);
			partida.jog1.setJogando(false);
			partida.jog2.setJogando(false);
			partida.jog1.partidas.add(partida);
			partida.jog2.partidas.add(partida);
			
		} else if (partida.result== 2) {
			partida.jog2.setPontos(+1);
			partida.jog1.setPontos(-1);
			partida.jog1.setJogando(false);
			partida.jog2.setJogando(false);
			partida.jog1.partidas.add(partida);
			partida.jog2.partidas.add(partida);
		}
	}

}
