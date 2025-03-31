package br.sp.senai.jandira.calcular_figuras.model;

public class Circunferencia {
	
	private double raio;

	public void setRaio (double raio){
		this.raio = raio;
	}
	
	public double getRaio (){
		return raio;
	}
	
	public double calcularAreaCircunferencia(){
		double area = Math.PI * (raio * raio);
		return area;
	}
	
	public void exibirResultado() {
		System.out.println("--------------");
		System.out.println("Área da Circunferência: " + calcularAreaCircunferencia());
		System.out.println("--------------");
	}
}
