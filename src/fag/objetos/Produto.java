package fag.objetos;

public class Produto {
	
	private String Nome;
	private Double Preço;
	private Integer Quantidade;
	
	
	
	public Produto() {
		
	}
	
	public Produto (String Nome,Double Preço, Integer Quantidade) {
		this.Nome = Nome;
		this.Preço = Preço;
		this.Quantidade = Quantidade;
		
		
		
		
		
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		this.Nome = nome;
	}


	public Double getPreço() {
		return Preço;
	}


	public void setPreço(Double preço) {
		this.Preço = preço;
	}


	public Integer getQuantidade() {
		return Quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.Quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Produto [Nome=" + Nome + ", Preço=" + Preço + ", Quantidade=" + Quantidade + "]";
	}
	
	
	

}
