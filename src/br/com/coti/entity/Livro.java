package br.com.coti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblivro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(length=50, unique=true)
	private String nome;
	@Column(length=50)
	private String autor;
	@Column
	private Double preco;
	
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Livro(Long id, String nome, String autor, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.preco = preco;
	}
	

	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + ", autor=" + autor + ", preco=" + preco + "]";
	}

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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
