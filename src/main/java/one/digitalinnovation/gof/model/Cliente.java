package one.digitalinnovation.gof.model;

import javax.persistence.*;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;

	@ManyToOne
	private Endereco endereco;

	public Cliente() {} // obrigatório para o JPA

	public Cliente(Long id, String nome, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	// Getters e setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	// ✅ Builder manual
	public static class Builder {
		private Long id;
		private String nome;
		private Endereco endereco;

		public Builder id(Long id) {
			this.id = id;
			return this;
		}

		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder endereco(Endereco endereco) {
			this.endereco = endereco;
			return this;
		}

		public Cliente build() {
			return new Cliente(id, nome, endereco);
		}
	}
}
