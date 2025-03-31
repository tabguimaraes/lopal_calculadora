package br.sp.senai.jandira.calcular_figuras.model;

public class Quadrado {
	
	private double lado; 
	
	public void setLado (double lado){
		this.lado = lado;
	}
	
	public double getLado (){
		return lado;
	}
	
	public double calcularAreaQuadrado(){
		double area = lado * lado;
		return area;
	}
	
	public double calcularPerimetroQuadrado() {
		double perimetro = lado * 4;
		return perimetro;	
	}
	
	public void exibirResultado() {
		System.out.println("--------------");
		System.out.println("Área do Quadrado: " + calcularAreaQuadrado());
		System.out.println("Perimetro do Quadrado: " + calcularPerimetroQuadrado());
		System.out.println("--------------");
	}
}
