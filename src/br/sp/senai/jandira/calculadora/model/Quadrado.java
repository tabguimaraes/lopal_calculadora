package br.sp.senai.jandira.calculadora.model;

public class Quadrado {

	private double lado;

//	Verificar real necessidade de uso da função getLado
//	public double getLado() {
//		return lado;
//	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return lado * lado;
	}

	public double calcularPerimetro() {
		return 4 * lado;
	}
}
