package com.lojagame.LojaGame.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atibuto Nome é obrigatório!")
	@Size(min=5, max=100, message="O atributo Nome deve conter no mínimo 5 e no máximo 100 carfacteres!")
	private String nome;
	
	@NotBlank
	@Size(min=5, max=100, message="O atributo Marca deve conter no mínimo 5 e no máximo 100 carfacteres!")
	private String marca;
	
	@Size(min=10, max=300)
	private String descricao;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private ProdutoModel produto;

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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ProdutoModel getProduto() {
		return produto;
	}

	public void setProduto(ProdutoModel produto) {
		this.produto = produto;
	}
	
	
	
	
}
