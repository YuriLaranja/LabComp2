import java.util.ArrayList;

public class Jogador {

public String userName;
public  String senha;
public int pontos = 1000;
ArrayList<Partida> partidas = new ArrayList<>();
public boolean status;
public static boolean statuslogout;
public boolean jogando;

public String getUsername() {
	return userName;
}
public void setUsername(String username) {
	this.userName = username;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public int getPontos() {
	return pontos;
}
public void setPontos(int pontos) {
	this.pontos += pontos;

}


public Jogador(String username, String senha) {
	this.userName = username;
	this.senha = senha;
}
public boolean getStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public boolean getJogando() {
	return jogando;
}
public void setJogando(boolean jogando) {
	this.jogando = jogando;
}


}
