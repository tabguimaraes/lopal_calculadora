package br.sp.senai.jandira.calculadora.model;

public class Triangulo {

	private double base = 11;
	private double ladoEsquerdo = 11;
	private double ladoDireito = 11;
	private String triangulo;

//	public void verificaTriangulo() {
//		if (base + ladoEsquerdo > ladoDireito && base + ladoDireito > ladoEsquerdo
//				&& ladoEsquerdo + ladoDireito > base) {
//			tipoTriangulo();
//		} else {
//			System.out.println(("Não é possível formar um triângulo"));
//		}
//
//	};

	public String tipoTriangulo() {
		triangulo = base == ladoEsquerdo && base == ladoDireito ? "Equilátero"
				: base == ladoEsquerdo || base == ladoDireito || ladoEsquerdo == ladoDireito ? "Isóceles" : "Ecaleno";
		return triangulo;

	};
}
//private double base;
//private double altura;
//
//public double getBase() {
//	return base;
//}
//
//public void setBase(double base) {
//	this.base = base;
//}
//
//public double getAltura() {
//	return altura;
//}
//
//public void setAltura(double altura) {
//	this.altura = altura;
//}
//
//public double calcularArea() {
//	return (base * altura) / 2;
//}