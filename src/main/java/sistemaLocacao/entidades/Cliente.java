package sistemaLocacao.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cpf;
	private int idade;
	
	@OneToOne
	private Telefone telefone;

	@OneToMany
	private List<Locacao> locacoes = new ArrayList();
	
	@OneToMany
	private List<Endereco> enderecos = new ArrayList();

	public Cliente(String nome, String cpf, int idade, Telefone telefone, Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
		this.enderecos.add(endereco);
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getIdade() {
		return idade;
	}
	public Telefone getTelefone() {
		return telefone;
	}

	public List<Endereco> getEndereco() {
		return enderecos;
	}

	public void addLocacao(Locacao l) {
		locacoes.add(l);
	}

	public List<Locacao> getLocacoes() {
		return locacoes;
	}
	

}
