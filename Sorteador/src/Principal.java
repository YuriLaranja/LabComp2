

public class Principal {

    public static void main(String[] args) {
        DadosDeGamao sorteadorJ1 = new DadosDeGamao();
        DadosTriplos sorteadorJ2 = new DadosTriplos();


        JogoMalucoComSorteadores<DadosDeGamao,DadosTriplos> jm = new JogoMalucoComSorteadores<>("JogoMuitoMaluco",
                "Yuri", "Gio", 1,
                sorteadorJ1, sorteadorJ2);
        for (int numeroDeRodadas = 1; numeroDeRodadas <= 100000; numeroDeRodadas *= 2) {
            jm.setNumeroDeRodadas(numeroDeRodadas);
            jm.jogar();

            System.out.println(jm.obterResultadoUltimoJogo());
        }
        System.out.println("Porcentagem de vitórias do Jogador 1: " + jm.getPercentualVitoriasJogador1());
      
    }
}