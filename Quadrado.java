public class Quadrado extends Bidimensional {
	public Quadrado(String nome, int dimensao, double comprimento, double largura) {
		if (comprimento != largura) {
			System.out.println("Comprimento não pode ser diferente da altura!");
			return;
		}
		
		this.setNome(nome);
		this.setDimensao(dimensao);
		this.setComprimento(comprimento);
		this.setLargura(largura);
	}
	
	@Override
	public double getAltura() {
		// TODO Auto-generated method stub
		return this.getComprimento();
	}

	@Override
	public void print() {
		System.out.println(super.toString());
		this.area();
	}

	@Override
	public void area() {
		System.out.println("A area do quadrado e de: " + this.getComprimento()*this.getAltura());
	}
}
