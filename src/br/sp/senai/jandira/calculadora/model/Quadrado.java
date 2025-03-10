package br.sp.senai.jandira.calculadora.model;

public class Quadrado {
	
	private int comprimento;
	private int altura;
		
	
	public void setQuadrado (int comprimento, int altura) {
		this.comprimento = comprimento;
		this.altura = altura;
	};
	
	public int getQuadrado(int comprimento, int altura){
		this.comprimento = comprimento;
		this.altura = altura;
		int area = (comprimento*altura);
		return area;
		};
		
}
