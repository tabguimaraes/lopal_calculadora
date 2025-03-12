package br.sp.senai.jandira.calculadora;

import br.sp.senai.jandira.calculadora.model.Quadrado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(10);
		
		System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());

	}

}