package sistemaLocacao.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String estado;
	private String cidade;
	private String rua;
	private int numero;

	public Endereco(String estado, String cidade, String rua, int numero) {
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
	}
	
	public String getEstado() {
		return estado;
	}


	public String getCidade() {
		return cidade;
	}


	public String getRua() {
		return rua;
	}


	public int getNumero() {
		return numero;
	}





}