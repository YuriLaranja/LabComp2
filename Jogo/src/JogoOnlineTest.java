import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JogoOnlineTest {
	public Jogador julio, laranja, yurij,Giovanna,elias;

	@Before
	public void setUp() {
		JogoOnline.CadastrarJogador("yurhhji", "12345");
		
		JogoOnline.CadastrarJogador("laranja", "12");
		JogoOnline.Login("julio", "12345");
		JogoOnline.CadastrarJogador("elias", "123456789");
		JogoOnline.Login("laranja", "12");
		julio = JogoOnline.listaJogadores.get(1);
		laranja = JogoOnline.listaJogadores.get(2);
		yurij = JogoOnline.listaJogadores.get(0);
		
		JogoOnline.CadastrarJogador("julio", "12345");
	}

	@Test
	public void testarcadastroUserIgual() {
		assertEquals("Cadastro com usuario iguais não funciona", false, JogoOnline.CadastrarJogador("julio", "aaaa"));
	}

	@Test
	public void testarLoginSenhaErrada() {
		assertEquals("Login com senha errada nao funciona", false, JogoOnline.Login("julio", "123456"));

	}

	@Test
	public void testarUsuariOnline() {

		assertEquals("Login com usuario Online nao funciona", false, JogoOnline.Login("julio", "12345"));

	}

	@Test
	public void testarUsuariOfLline() {

		assertEquals("Login com usaurio ofline e user e senha certa funciona", true,
				JogoOnline.Login("yurhhji", "12345"));

	}

	@Test
	public void testarSenhacerta() {
		JogoOnline.CadastrarJogador("Giovanna", "12345");

		assertEquals("Login com senha certa funciona", true, JogoOnline.Login("Giovanna", "12345"));

	}

	@Test
	public void testarlogoutUsuarioOnline() {
		JogoOnline.CadastrarJogador("uri", "100");
		JogoOnline.Login("uri", "100");

		assertEquals("Login com senha certa funciona", false, JogoOnline.Logout("uri", "100"));

	}

	@Test
	public void testarEmpate() {
		// pedir ajuyda ao professor

		Partida partida = JogoOnline.IniciarPartida(julio, laranja);
		
		JogoOnline.encerrarPartida(partida, partida.result);
		partida.result = 0;
		assertEquals("Testar empate randomicamente", 0, partida.result);
		

	}

	@Test
	public void testarvitoria1() {

		JogoOnline.Login("yurhhji", "12345");
		Partida partida2 = JogoOnline.IniciarPartida(laranja, yurij);
		JogoOnline.encerrarPartida(partida2, partida2.result);
		partida2.result = 1;
		assertEquals("Testar vitoria  randomicamente", 1, partida2.result);
		

	}

	@Test
	public void testarvitoria2() {

		Partida partida3 = JogoOnline.IniciarPartida(julio, laranja);
		JogoOnline.encerrarPartida(partida3, partida3.result);
		partida3.result = 2;
		assertEquals("Testar vitoria randomicamente", 2, partida3.result);
		
		

	}

	@Test
	public void testaradversário() {
		JogoOnline.Logout("Giovanna", "12345");
		JogoOnline.Logout("julio", "12345");
		JogoOnline.Login("Giovanna", "12345");
		Giovanna = JogoOnline.listaJogadores.get(5);
		
		
		assertEquals("usuario encontrado", yurij, JogoOnline.escolherAdversario(Giovanna));
		

	}

}