package br.com.zup.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value = {"SiglaCombustivel","TipoVeiculo","Combustivel","CodigoFipe","MesReferencia"})
public class VeiculoJson {

	@JsonProperty("Valor")
	private String valor;
	@JsonProperty("Marca")
	private String marca;
	@JsonProperty("Modelo")
	private String modelo;
	@JsonProperty("AnoModelo")
	private int anoModelo;
	public VeiculoJson() {
		super();
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	
	
}
