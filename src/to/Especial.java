package to;

public class Especial extends Movimento{
	static int dano = 30;
	static int custoEnergia = 100;
	
	public Especial(){
		super("Especial");
	}
	
	@Override
	public String executar(Player autor, Player alvo) throws ExcecaoEnergiaInsuficiente{
		if(autor.getEnergia() < custoEnergia){
			throw new ExcecaoEnergiaInsuficiente("Energia Insuficiente!");
		}else{
			autor.setEnergia(0);
			alvo.receberDano(dano);
			
			return autor.getNome() + " usou o Especial para atacar " + alvo.getNome() + "!";
		}
	}
}