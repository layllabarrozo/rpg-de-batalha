package to;

import java.util.ArrayList;
import dao.Placar;

public class Batalha {
	Player player1;
	Player player2;
	Player jogadorDaVez;
	ArrayList<String> historico = new ArrayList<>();
    private Placar placar = new Placar();
	
	public Batalha(Player player1, Player player2){
		this.player1 = player1;
		this.jogadorDaVez = player1;
		this.player2 = player2;
	}
	
	public void jogar(Movimento movimento) {
        if(getVencedor() != null){
            return;
        }

        Player autor = jogadorDaVez;
        Player alvo = (autor == player1) ? player2 : player1;

        try {
            registrar(movimento.executar(autor, alvo)); 
        }catch (ExcecaoEnergiaInsuficiente e) {
            registrar(autor, e.getMessage());
            return;
        }

        if (alvo.estaVivo()) {
            jogadorDaVez = alvo;
        }
    }

    public Player getVencedor(){
        if(!player1.estaVivo()){
            return player2;
        }else if(!player2.estaVivo()){
            return player1;
        }else{
            return null;
        }
    }

    public Player getJogadorDaVez(){
        return jogadorDaVez;
    }
    
    public void registrar(String frase) {
        historico.add(frase);
        placar.registrar(frase);
    }

    public void registrar(Player jogador, String frase) {
        registrar(jogador.getNome() + ": " + frase);
    }

    public ArrayList<String> getHistorico() {
        return historico;
    } 
}
