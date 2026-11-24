package to;

public class Defesa extends Movimento{
	static int energiaGanha = 15;
	
	public Defesa(){
		super("Defesa");
	}
	
	@Override
	public String executar(Player autor, Player alvo){
		autor.setDefendendo(true);
		autor.ganharEnergia(energiaGanha);
		
		return autor.getNome() + " se defendeu do ataque de " + alvo.getNome() + "!";
	}
}
