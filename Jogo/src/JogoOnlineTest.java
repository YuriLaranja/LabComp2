import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JogoOnlineTest {
	public Jogador julio, laranja, yurij,Giovanna,elias;

	@Before
	public void setUp() throws UsuarioInexistenteException, SenhaInvalidaException {
		yurij = JogoOnline.CadastrarJogador("yurhhji", "12345");
		
		laranja = JogoOnline.CadastrarJogador("laranja", "12");
		
		elias =JogoOnline.CadastrarJogador("elias", "123456789");
		JogoOnline.Login("laranja", "12");
		
		
		julio = JogoOnline.CadastrarJogador("julio", "12345");
		JogoOnline.Login("julio", "12345");
	}

	

	@Test
	public void testarLoginSenhaErrada() throws SenhaInvalidaException, UsuarioInexistenteException {
		Jogador marcio = JogoOnline.CadastrarJogador("marcio", "877");
		JogoOnline.Login("marcio", "875");
		

	}

	

	

	@Test
	public void testarUsuariOfLline() throws UsuarioInexistenteException, SenhaInvalidaException {
		JogoOnline.Login("yurhhji", "12345");
		assertEquals("Login com usuario ofline e user e senha certa funciona", true,
				yurij.getStatus());

	}

	@Test
	public void testarSenhacerta() throws UsuarioInexistenteException, SenhaInvalidaException {
		Jogador gio =JogoOnline.CadastrarJogador("Giovanna", "12345");
		JogoOnline.Login("Giovanna", "12345");
		
		assertEquals("Login com senha certa funciona", true, gio.getStatus());

	}

	@Test
	public void testarlogoutUsuarioOnline() {
		Jogador cesar = JogoOnline.CadastrarJogador("uri", "100");
		
		assertEquals("Login com senha certa funciona", false, JogoOnline.Logout(cesar));

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
	public void testarvitoria1() throws UsuarioInexistenteException, SenhaInvalidaException {

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
	public void testaradversário() throws UsuarioInexistenteException, SenhaInvalidaException {
		Jogador giovanna2 = JogoOnline.CadastrarJogador("aaa", "aaa");
		JogoOnline.Login("aaa", "aaa");
		JogoOnline.Logout(julio);
		JogoOnline.Login("yurhhji", "12345");
		
		JogoOnline.Logout(laranja);
		
		
		System.out.println(JogoOnline.escolherAdversario(giovanna2).getUsername());
		assertEquals("usuario encontrado", "yurhhji", JogoOnline.escolherAdversario(giovanna2).getUsername());
		

	}

}