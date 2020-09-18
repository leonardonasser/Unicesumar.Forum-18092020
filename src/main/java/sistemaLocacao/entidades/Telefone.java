package sistemaLocacao.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Telefone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int codDiscagem;
	private int codDDD;
	private int numero;
	
	@OneToOne
	private Cliente cliente;
	
	public Telefone(int codDiscagem, int codDDD, int numero) {
		this.codDiscagem = codDiscagem;
		this.codDDD = codDDD;
		this.numero = numero;
	}
	
	public int getCodDiscagem() {
		return codDiscagem;
	}
	public int getCodDDD() {
		return codDDD;
	}
	public int getNumero() {
		return numero;
	}
	
	
	

}