package to;

public class Player {
	private String nome;
	private int vida;
	private int energia;
	boolean defendendo;
	
	Player(String nome){
		this.nome = nome;
		vida = 100;
		energia = 0;
	}
	
	Player(String nome, int vida){
		this.nome = nome;
		this.vida = vida;
		energia = 0;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setVida(int vida){
		if(vida > 0) {
			this.vida = vida;
		}
	}
	
	public int getVida(){
		return vida;
	}
	
	public void setEnergia(int energia){
		this.energia = energia;
	}
	
	public int getEnergia(){
		return energia;
	}
	
	public void receberDano(int dano){
		if(defendendo){
			dano = dano - (dano/100)*50;
			vida -= dano;
			defendendo = false;
		}else {
			vida -= dano;
		}
	}
	
	public void ganharEnergia(int pontos){
		energia += pontos;
	}
	
	public void zerarEnergia(){
		energia = 0;
	}
	
	public boolean estaVivo() {
		return vida > 0;
	}
	
	public String toString(){
		return "Nome: " + nome + ", Vida: " + vida + ", Energia: " + energia;
	}
}
