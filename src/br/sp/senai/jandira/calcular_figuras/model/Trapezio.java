package br.sp.senai.jandira.calcular_figuras.model;

public class Trapezio {

	private double baseMenor;
	private double baseMaior;
	private double altura;

	public void setBaseMenor (double baseMenor){
		this.baseMenor = baseMenor;
	}
	
	public double getBaseMenor (){
		return baseMenor;
	}
	
	public void setBaseMaior (double baseMaior){
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior (){
		return baseMaior;
	}
	
	public void setAltura (double altura){
		this.altura = altura;
	}
	
	public double getAltura (){
		return altura;
	}
	
	public double calcularAreaTrapezio(){
		double area = (baseMenor + baseMaior) * (altura / 2);
		return area;
	}
	
	public void exibirResultado() {
		System.out.println("--------------");
		System.out.println("Área do Trapézio: " + calcularAreaTrapezio());
		System.out.println("--------------");
	}
	
}
