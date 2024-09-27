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
		System.out.println(super.toString() + " A area do triângulo é de: " + this.area());
	}

	@Override
	public double area() {
		return this.getLargura()*this.getComprimento()/2;
	}
	
}
