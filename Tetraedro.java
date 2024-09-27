public class Tetraedro extends Tridimensional {
	public Tetraedro(String nome, int dimensao, double altura, double largura, double profundidade) {
		boolean invalido = Math.sqrt(6)/3*largura != altura || Math.sqrt(3)/2*largura != profundidade;
		
		if (invalido) {
			System.out.println("Altura e largura não condizem ou profundidade e largura não condizem com o tetraedro");
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
		System.out.println(super.toString() + ", O volume do tetraedro é de: " + this.volume());
	}

	@Override
	public double volume() {
		return Math.sqrt(2)/12*Math.pow(this.getLargura(), 3);
	}

	@Override
	public double area() {
		return Math.sqrt(3)*Math.pow(this.getLargura(), 2);
	}
}
