package com.springbatch.jdbccursorreader.dominio;


import java.util.ArrayList;
import java.util.List;


public class Cliente {
	private Long id;
	private String nome;
	private String sobrenome;
	private String idade;
	private String email;
	private List<Livros> livros = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Livros> getLivros() {
		return livros;
	}

	public void setLivros(List<Livros> livros) {
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Cliente{" +
	                "nome='" + nome + "'" +
	                ", sobrenome ='" + sobrenome + "'" +
	                ", idade='" + idade + "'" +
	                ", email='" + email + "'" +
	                (livros.isEmpty()? "" : ", transacoes=" + livros)
	                + '}';
	}
}