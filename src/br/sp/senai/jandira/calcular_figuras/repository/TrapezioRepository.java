package br.sp.senai.jandira.calcular_figuras.repository;

import java.util.Scanner;
import br.sp.senai.jandira.calcular_figuras.model.Trapezio;

public class TrapezioRepository {

	public void criarTrapezio() {
		
		Scanner leitor = new Scanner(System.in);
		
		Trapezio trapezio = new Trapezio();
		
		System.out.println();
		System.out.println("Criando Trapézio...");
		
		System.out.print("Digite a base menor do Trapézio: ");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.print("Digite a base maior do Trapézio: ");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Digite a altura do Trapézio: ");
		trapezio.setAltura(leitor.nextDouble());
		
		trapezio.exibirResultado();
		
		leitor.close();
		
	}
	
}
