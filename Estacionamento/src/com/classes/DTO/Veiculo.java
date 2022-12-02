package com.classes.DTO;

public class Veiculo {

	private String placa;
	private String cor;
	private String modelo;
	private int n_rodas;
	
	public Veiculo(String placa, String cor, String modelo, int n_rodas) {
		setPlaca(placa);
		setCor(cor);
		setModelo(modelo);
		setN_rodas(n_rodas);
	}
	public Veiculo(String placa) {
		setPlaca(placa);
	}

	public Veiculo() {

	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getN_rodas() {
		return n_rodas;
	}

	public void setN_rodas(int n_rodas) {
		this.n_rodas = n_rodas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Veiculo [cor=");
		builder.append(cor);
		builder.append(", placa=");
		builder.append(placa);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", n_rodas=");
		builder.append(n_rodas);
		builder.append("]");
		return builder.toString();
	}
	
	
}