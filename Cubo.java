public class Cubo extends Tridimensional {
	public Cubo(String nome, int dimensao, double altura, double largura, double profundidade) {
		boolean invalido = altura != largura || altura != profundidade || largura != profundidade;
		
		if (invalido) {
			System.out.println("Altura, largura e profundidade de um cubo devem ser iguais");
			return;
		}
		
		this.setNome(nome);
		this.setDimensao(dimensao);
		this.setAltura(altura);
		this.setLargura(largura);
		this.setProfundidade(profundidade);
	}
	
	@Override
	public void print() {
		System.out.println(super.toString() + ", O volume do cubo é de: " + this.volume());
	}

	@Override
	public double volume() {
		return this.getAltura()*this.getLargura()*this.getProfundidade();
	}
	
	@Override
	public double area() {
		return 4*this.getLargura();
	}
}
