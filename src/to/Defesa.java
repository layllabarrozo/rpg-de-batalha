package to;

public class Defesa extends Movimento{
	static int energiaGanhar = 15;
	
	Defesa(){
		super("Defesa");
	}
	
	public String executar(Player autor, Player alvo){
		autor.defendendo = true;
		autor.ganharEnergia(energiaGanhar);
		
		return "frase(?)";
	}
}
