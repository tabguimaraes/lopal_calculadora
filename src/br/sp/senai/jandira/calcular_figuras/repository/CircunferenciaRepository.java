package br.sp.senai.jandira.calcular_figuras.repository;

import java.util.Scanner;
import br.sp.senai.jandira.calcular_figuras.model.Circunferencia;

public class CircunferenciaRepository {

	public void criarCircunferencia() {
		
		Scanner leitor = new Scanner(System.in);
		
		Circunferencia circulo = new Circunferencia();
		
		System.out.println();
		System.out.println("Criando Circunferência...");
		
		System.out.print("Digite o raio da circunferência: ");
		circulo.setRaio(leitor.nextDouble());
		
		circulo.exibirResultado();
		
		leitor.close();
		
	}
	
}
