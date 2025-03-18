package br.sp.senai.jandira.calculadora;

//import br.sp.senai.jandira.calculadora.model.Circulo;
import br.sp.senai.jandira.calculadora.model.Quadrado;
import br.sp.senai.jandira.calculadora.model.Retangulo;
import br.sp.senai.jandira.calculadora.model.Trapezio;
import br.sp.senai.jandira.calculadora.model.Triangulo;

public class Main {

	public static void main(String[] args) {
//		Circulo circulo = new Circulo();
//		circulo.setRaio(12);

//		System.out.println("Área do círculo: " + Math.round(circulo.calcularArea()));

		Quadrado quadrado = new Quadrado();
		quadrado.setLado(10);

		System.out.println("Área do quadrado: " + quadrado.calcularArea());
		System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

		Retangulo retangulo = new Retangulo();
		retangulo.setBase(10);
		retangulo.setAltura(5);

		System.out.println("Área do retângulo: " + retangulo.calcularArea());
		System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());

		Trapezio trapezio = new Trapezio();
		trapezio.setBaseMaior(12);
		trapezio.setBaseMenor(4);
		trapezio.setAltura(5);

		System.out.println("Área do trapézio: " + trapezio.calcularArea());

		Triangulo triangulo = new Triangulo();

		System.out.println("Tipo do triângulo: " + triangulo.tipoTriangulo());

	}

}

//Triangulo triangulo;

//Triangulo triangulo = new Triangulo();
//triangulo.setBase(10);
//triangulo.setAltura(5);
//
//System.out.println("Área do triângulo: " + triangulo.calcularArea());