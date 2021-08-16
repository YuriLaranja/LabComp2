import java.util.ArrayList;

public class JogoOnline {

	public static ArrayList<Jogador> listaJogadores = new ArrayList<>();

	public static boolean CadastrarJogador(String username, String senha) {
		Jogador novoJogador = new Jogador(username, senha);

		for (Jogador i : listaJogadores) {
			if (i.userName.equals(novoJogador.userName)) {
				return false;
			}
		}

		listaJogadores.add(novoJogador);

		return true;
	}

	public static boolean Login(String username, String senha) {

		for (Jogador i : listaJogadores) {
			if (i.userName.equals(username)) {
				if (i.status == true) {
					// usuario ja ta online
					return false;
				} else if (i.senha.equals(senha)) {
					i.status = true;
					return i.status;
				} else {
					// senha errada
					return false;
				}
			}
		}
		return false;
	}

	public static boolean Logout(String username, String senha) {
		boolean teste = JogoOnline.Login(username, senha);
		if (teste == false) {
			return false;
		}
		return true;
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
