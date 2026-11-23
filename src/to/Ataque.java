package to;

public class Ataque extends Movimento{
	static int dano = 15;
	static int energiaGanha = 25;
	
	Ataque(){
		super("Ataque");
	}
	
	public String executar(Player autor, Player alvo) {
		alvo.receberDano(dano);
		autor.ganharEnergia(energiaGanha);
		
		return autor.getNome() + "atacou " + alvo.getNome() + "!";
	}
}
