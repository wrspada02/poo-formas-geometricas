public class Quadrado extends Bidimensional {
	public Quadrado(String nome, int dimensao, double comprimento, double largura) {
		if (comprimento != largura) {
			System.out.println("Comprimento não pode ser diferente da altura em um quadrado!");
			return;
		}
		
		this.setNome(nome);
		this.setDimensao(dimensao);
		this.setComprimento(comprimento);
		this.setLargura(largura);
	}
	
	@Override
	public double getAltura() {
		return this.getComprimento();
	}

	@Override
	public void print() {
		System.out.println(super.toString() + ", A area do quadrado é de: " + this.area());
	}

	@Override
	public double area() {
		return this.getComprimento()*this.getAltura();
	}
}
