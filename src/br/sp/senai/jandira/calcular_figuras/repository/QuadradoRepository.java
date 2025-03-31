package br.sp.senai.jandira.calcular_figuras.repository;

import java.util.Scanner;
import br.sp.senai.jandira.calcular_figuras.model.Quadrado;

public class QuadradoRepository {

	public void criarQuadrado() {
		
		Scanner leitor = new Scanner(System.in);
		
		Quadrado quadrado = new Quadrado();
		
		System.out.println();
		System.out.println("Criando Quadrado...");
		
		System.out.print("Digite um dos lados do quadrado: ");
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.exibirResultado();
		
		leitor.close();
		
	}
	
}
