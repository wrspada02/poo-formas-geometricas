public abstract class Bidimensional extends Forma {
	private double comprimento;
	private double largura;
	
	public double getComprimento() {
		return this.comprimento;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getLargura() {
		return this.largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public String toString() {
		return super.toString() + ", Comprimento: " + this.comprimento + ", Largura: " + this.largura;
	}
	
	public abstract double area();
}
