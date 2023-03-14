package domain.model;

import java.time.LocalDate;

public class Mentoria extends Treinamento {

	private LocalDate data;

	public Mentoria( ) {
		
	}
	
	

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super(titulo, descricao);
		this.data = data;
	}



	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + ", getTitulo()=" + getTitulo() + ", getDescricao()="
				+ getDescricao() + "]";
	}



	@Override
	public double CalcularXp() {
		return XP_PADRAO+20;
	}
	
	
	
	
	
}
