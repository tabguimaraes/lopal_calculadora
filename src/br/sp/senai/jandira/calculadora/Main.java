package br.sp.senai.jandira.calculadora;

import br.sp.senai.jandira.calculadora.model.Circulo;
import br.sp.senai.jandira.calculadora.model.Quadrado;
import br.sp.senai.jandira.calculadora.model.Retangulo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(10);

		System.out.println("Área do quadrado: " + quadrado.calcularArea());
		System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

		Circulo circulo = new Circulo();
		circulo.setRaio(12);

		System.out.println("Área do círculo: " + circulo.calcularArea());

		Retangulo retangulo = new Retangulo();
		retangulo.setBase(10);
		retangulo.setAltura(5);

		System.out.println("Área do retângulo: " + retangulo.calcularArea());
		System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
	}

}