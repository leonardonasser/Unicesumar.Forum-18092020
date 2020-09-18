package sistemaLocacao.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String modelo;
	private String marca;
	private String placa;
	private String cor;
	private long quilometragem;
	private int valorLocacao;
	
	@OneToMany
	private List<Locacao> locacoes = new ArrayList();
	
	public Carro(String modelo, String marca, String placa, String cor, long quilometragem, int valorLocacao) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.cor = cor;
		this.quilometragem = quilometragem;
		this.valorLocacao = valorLocacao;
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCor() {
		return cor;
	}

	public long getQuilometragem() {
		return quilometragem;
	}

	public int getValorLocacao() {
		return valorLocacao;
	}

	public void addLocacao(Locacao l) {
		locacoes.add(l);
	}
	
}