public abstract class Forma implements Shape {
	private String nome;
	private int dimensao;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getDimensao() {
		return this.dimensao;
	}

	public void setDimensao(int dimensao) {
		this.dimensao = dimensao;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + ", Dimensão: " + this.dimensao;
	}
}
