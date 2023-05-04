package com.springbatch.jdbccursorreader.dominio;


import java.math.BigDecimal;

public class Livros {
    private Long id;
    private String nome;
    private BigDecimal valor;
    private String idLivro;
    private String tpMovimento;
    private String autor;
    private Integer anoPublicacao;
    private String editora;
    private String idioma;
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public String getIdLivro() {
		return idLivro;
	}


	public void setIdLivro(String idLivro) {
		this.idLivro = idLivro;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}


	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}


	public String getEditora() {
		return editora;
	}


	public void setEditora(String editora) {
		this.editora = editora;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public String getTpMovimento() {
		return tpMovimento;
	}

	public void setTpMovimento(String tpMovimento) {
		this.tpMovimento = tpMovimento;
	}


	@Override
	public String toString() {
	    return "Livros{" +
	            "id=" + id +
	            ", nome='" + nome + '\'' +
	            ", valor=" + valor +
	            ", idLivro='" + idLivro + '\'' +
	            ", tpMovimento='" + tpMovimento + '\'' +
	            ", autor='" + autor + '\'' +
	            ", anoPublicacao=" + anoPublicacao +
	            ", editora='" + editora + '\'' +
	            ", idioma='" + idioma + '\'' +
	            '}';
	}
}
