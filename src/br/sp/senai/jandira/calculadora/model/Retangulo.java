package br.sp.senai.jandira.calculadora.model;

//DEIXEI OS GETTERS, MAS NÃO VI OU NÃO ENTENDI A NECESSIDADE USAR ELES. AO CHAMAR NA MAIN.JAVA, O CODIGO É EXECUTADO SEM ERRO.

public class Retangulo {
	private double base;
	private double altura;

//	public double getBase() {
//		return base;
//	}

	public void setBase(double base) {
		this.base = base;
	}

//	public double getAltura() {
//		return altura;
//	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		return base * altura;
	}

	public double calcularPerimetro() {
		return 2 * (base + altura);
	}

}
