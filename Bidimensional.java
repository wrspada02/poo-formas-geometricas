public abstract class Bidimensional extends Forma {
	private double comprimento;
	private double largura;
	
	public double getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public abstract void area();
	
	public String toString() {
		return super.toString() + ", Comprimento: " + this.comprimento + ", Largura: " + this.largura;
	}
}
