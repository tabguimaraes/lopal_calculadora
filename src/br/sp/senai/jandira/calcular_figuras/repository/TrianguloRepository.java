package br.sp.senai.jandira.calcular_figuras.repository;

import java.util.Scanner;
import br.sp.senai.jandira.calcular_figuras.model.Triangulo;

public class TrianguloRepository {

	public void criarTriangulo() {
		
		Scanner leitor = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		
		System.out.println();
		System.out.println("Criando Triângulo...");
		
		System.out.print("Digite a base do triângulo: ");
		triangulo.setBase(leitor.nextDouble());
		
		System.out.print("Digite o lado esquerdo do triângulo: ");
		triangulo.setLadoEsquerdo(leitor.nextDouble());
		
		System.out.print("Digite o lado direito do triângulo: ");
		triangulo.setLadoDireito(leitor.nextDouble());	
		
		triangulo.exibirResultado();
		
		leitor.close();
		
	}
	
}
