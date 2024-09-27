public abstract class Tridimensional extends Forma {
	private double largura;
	private double profundidade;
	private double altura;
	
	public double getLargura() {
		return this.largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double getProfundidade() {
		return this.profundidade;
	}
	
	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return super.toString() + ", Largura: " + this.largura + ", Profundidade: " + this.profundidade + ", Altura: " + this.altura;
	}
	
	public abstract double volume();
	
	public abstract double area();
}
