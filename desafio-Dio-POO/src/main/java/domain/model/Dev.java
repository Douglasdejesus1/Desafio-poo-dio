package domain.model;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String nome;
	private Set<Treinamento> conteudosInscritos = new LinkedHashSet<>();
	private Set<Treinamento> conteudosConcluidos =new LinkedHashSet<>();
	
	
	
	public Dev(String nome) {
		super();
		this.nome = nome;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public Set<Treinamento> getConteudosInscritos() {
		return conteudosInscritos;
	}


	public void setConteudosInscritos(Set<Treinamento> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}


	public Set<Treinamento> getConteudosConcluidos() {
		return conteudosConcluidos;
	}


	public void setConteudosConcluidos(Set<Treinamento> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}


	public void instreverCurso(Treinamento conteudo) {
		conteudosInscritos.add(conteudo);
	}
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getTreinamentos());	
		bootcamp.getDevsInscritos().add(this);
	}
	
	
	public void progredir() {
		Optional<Treinamento> conteudo = this.conteudosInscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}else {
			System.err.println("Voce nao esta matriculado em nenhum conteudo");
		}
		
		
	}
	
	public double CalcularTotalXp() {
		return this.conteudosConcluidos.stream()
				.mapToDouble(conteudo -> conteudo.CalcularXp())
				.sum();
	}
	
	public void exibirCursosInscritos() {
		for (Treinamento atividade: conteudosInscritos) {
			System.out.println(atividade);
		}
	}
	public void exibirConteudosConcluidos() {
		for (Treinamento atividade: conteudosConcluidos) {
			System.out.println(atividade);
		}
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) && Objects.equals(nome, other.nome);
	}

}
