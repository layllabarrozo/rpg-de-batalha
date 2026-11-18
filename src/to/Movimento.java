package to;

public abstract class Movimento {
	private String tipo;
	
	Movimento(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public abstract String executar(Player autor, Player alvo) throws ExcecaoEnergiaInsuficiente;
}
