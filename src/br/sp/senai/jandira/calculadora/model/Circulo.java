package br.sp.senai.jandira.calculadora.model;

public class Circulo {

	private double raio;

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

}
