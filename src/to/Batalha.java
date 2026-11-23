package to;

import java.util.ArrayList;

public class Batalha {
	Player player1;
	Player player2;
	Player jogadorDaVez;
	ArrayList<String> historico = new ArrayList<>();
	
	Batalha(Player player1, Player player2){
		this.player1 = player1;
		this.jogadorDaVez = player1;
		this.player2 = player2;
	}
	
	public void jogar(Movimento movimento) {
        Player autor = jogadorDaVez;
        Player alvo = (autor == player1) ? player2 : player1;

        try {
            historico.add(movimento.executar(autor, alvo));
            
        } catch (ExcecaoEnergiaInsuficiente e) {
            historico.add(e.getMessage());
            return;
        }

        if (alvo.estaVivo()) {
            jogadorDaVez = alvo;
        }
    }

    public Player getVencedor(){
        if(player1.getVida() == 0){
            return player2;
        }else if(player2.getVida() == 0){
            return player1;
        }else{
            return null;
        }
    }

    public Player getJogadorDaVez(){
        return jogadorDaVez;
    }

    public ArrayList<String> getHistorico() {
        return historico;
    } 
}
