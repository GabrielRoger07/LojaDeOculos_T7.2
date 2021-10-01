package modelo;

public class Lente extends Produto {
	private String especificacao;
	private float grau;
	private int quantLente;

//M�todo Construtor

	public Lente(String marca, int cod, float preco, float grau, String especif, int qtd) {
		this.marca = marca;
		this.preco = preco;
		this.codigoProd = cod;
		this.grau = grau;
		this.especificacao = especif;
		this.quantLente = qtd;
	}

//toString() para printar para o usu�rio as informa��es da lente	

	@Override
	public String toString() {
		return "Lente { Marca: " + marca + ", Preco: " + preco + ", C�digo do Produto: " + codigoProd + ", Grau: "
				+ grau + ", Especifica��o: " + especificacao + "}";
	}

//gets e sets

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public float getGrau() {
		return grau;
	}

	public void setGrau(float grau) {
		this.grau = grau;
	}

	public int getQuantLente() {
		return quantLente;
	}

	public void setQuantLente(int quantLente) {
		this.quantLente = quantLente;
	}

}
