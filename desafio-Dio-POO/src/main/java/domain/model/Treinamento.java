package domain.model;

public abstract class Treinamento {
	private String titulo;
	private String descricao;
	
	protected static final double XP_PADRAO =10d;
	
	public Treinamento( ) {
		 
	}
	
	
	public Treinamento(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}


	public abstract double CalcularXp();
	


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
