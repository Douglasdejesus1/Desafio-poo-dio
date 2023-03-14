package domain.model;

public class Curso extends Treinamento {
	
	private int cargaHoraria;

	

	public Curso() {
		
	}

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super(titulo, descricao);
		this.cargaHoraria = cargaHoraria;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", getTitulo()=" + getTitulo() + ", getDescricao()="
				+ getDescricao() + "]";
	}

	@Override
	public double CalcularXp() {
		return XP_PADRAO+cargaHoraria;
	}
	
	


	
	
}
