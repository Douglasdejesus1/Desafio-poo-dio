import java.time.LocalDate;

import domain.model.Bootcamp;
import domain.model.Curso;
import domain.model.Dev;
import domain.model.Mentoria;

public class Programa {

	public static void main(String[] args) {
		Curso javaBasico = new Curso("Java Basico", "tipos primitivos, "
				+ "modificadores de acesso,poo", 40);
		Curso mySql = new Curso("MySql", "intrudu��o a SGBD com mySql", 20);
		
		Mentoria  java20 = new Mentoria("Novidade Java20", "conheca as novas funcionalidades",
				LocalDate.of(2022, 03, 14));
		
		Dev douglas = new Dev("Douglas");
		Dev flavia = new Dev("Fl�via");
		
		Bootcamp javaBootcamp = new Bootcamp("Banco Pan - DIO","treinamento completo em Java");
		
		javaBootcamp.getTreinamentos().add(javaBasico);
		javaBootcamp.getTreinamentos().add(mySql);
		javaBootcamp.getTreinamentos().add(java20);
		
		douglas.inscreverBootcamp(javaBootcamp);
		flavia.inscreverBootcamp(javaBootcamp);
		
		System.out.println(flavia.getConteudosInscritos());
		
		System.out.println("-----");
		
		flavia.progredir();
		System.out.println(flavia.getConteudosConcluidos());
		flavia.progredir();
		System.out.println(flavia.getConteudosConcluidos());
		flavia.progredir();
		
		System.out.println(flavia.CalcularTotalXp());
		System.out.println(flavia.getConteudosConcluidos());

	}

}
