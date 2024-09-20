public class TrianguloEquilatero extends Bidimensional {
	public TrianguloEquilatero(String nome, int dimensao, double comprimento, double largura) {		
		this.setNome(nome);
		this.setDimensao(dimensao);
		this.setComprimento(comprimento);
		this.setLargura(largura);
	}
	
	@Override
	public double getAltura() {
		return Math.sqrt(3)*this.getLargura()/2;
	}

	@Override
	public void print() {
		System.out.println(super.toString());
		this.area();
	}

	@Override
	public void area() {
		System.out.println("A area do triangulo equilatero e de: " + this.getLargura()*this.getComprimento()/2);
	}
	
}
