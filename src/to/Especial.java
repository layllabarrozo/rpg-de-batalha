package to;

public class Especial extends Movimento{
	static int dano = 30;
	static int custoEnergia = 100;
	
	Especial(){
		super("Especial");
	}
	
	public String executar(Player autor, Player alvo) throws ExcecaoEnergiaInsuficiente{
		if(autor.getEnergia() < custoEnergia){
			//throws new ExcecaoEnergiaInsuficiente("Energia Insuficiente!");
			return "frase";
		}else{
			autor.setEnergia(0);
			alvo.receberDano(dano);
			
			return "frase";
		}
	}
}