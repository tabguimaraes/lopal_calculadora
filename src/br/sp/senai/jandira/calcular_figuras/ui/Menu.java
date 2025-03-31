package br.sp.senai.jandira.calcular_figuras.ui;

import java.util.Scanner;
import br.sp.senai.jandira.calcular_figuras.repository.CircunferenciaRepository;
import br.sp.senai.jandira.calcular_figuras.repository.QuadradoRepository;
import br.sp.senai.jandira.calcular_figuras.repository.RetanguloRepository;
import br.sp.senai.jandira.calcular_figuras.repository.TrapezioRepository;
import br.sp.senai.jandira.calcular_figuras.repository.TrianguloRepository;

public class Menu {
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println("CALCULADORA DE FIGURAS GEOMETRICAS");
		System.out.println("----------------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETANGULO");
		System.out.println("3 - TRAPÉZIO");
		System.out.println("4 - TRIÂNGULO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("6 - SAIR");
		System.out.println("----------------------------------");
		System.out.print("Digite uma opção de 1 a 6: ");
		
		int opcao = leitor.nextInt();
		
		switch (opcao) {
		case 1:
			QuadradoRepository quadradoRepository = new QuadradoRepository();
			quadradoRepository.criarQuadrado();
			break;
		case 2:
			RetanguloRepository retanguloRepository = new RetanguloRepository();
			retanguloRepository.criarRetangulo();
			break;
		case 3:
			TrapezioRepository trapezioRepository = new TrapezioRepository();
			trapezioRepository.criarTrapezio();
			break;
		case 4:
			TrianguloRepository trianguloRepository = new TrianguloRepository();
			trianguloRepository.criarTriangulo();
			break;
		case 5:
			CircunferenciaRepository circunferenciaRepository = new CircunferenciaRepository();
			circunferenciaRepository.criarCircunferencia();
			break;
		case 6:
			System.out.print("Tem certeza que deseja sair? (S/N) ");
			String escolha = leitor.next();
			
			if (escolha.equalsIgnoreCase("s")) {
				System.out.println();
				System.out.println("Sistema encerrado.");
				System.exit(0);
			} else if (escolha.equalsIgnoreCase("n")) {
				criarMenu();
			} else {
				System.out.println();
				System.out.println("Nenhuma opção válida digitada (\"S\" ou \"N\"), retornando ao menu...");
				criarMenu();
			}
		default:
			System.out.println("Nenhuma opção selecionada ou opção inválida!");
		}
		
		leitor.close();
	}
}
