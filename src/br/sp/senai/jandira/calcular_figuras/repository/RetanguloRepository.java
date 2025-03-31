package br.sp.senai.jandira.calcular_figuras.repository;

import java.util.Scanner;
import br.sp.senai.jandira.calcular_figuras.model.Retangulo;

public class RetanguloRepository {

	public void criarRetangulo() {
		
		Scanner leitor = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println();
		System.out.println("Criando Retangulo...");
		
		System.out.print("Digite a base do retangulo: ");
		retangulo.setBase(leitor.nextDouble());
		
		System.out.print("Digite a altura do retangulo: ");
		retangulo.setAltura(leitor.nextDouble());
		
		retangulo.exibirResultado();
		
		leitor.close();
	}
	
}
