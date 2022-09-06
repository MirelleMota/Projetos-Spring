package com.lojagame.LojaGame.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categoria")
public class CategoriaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atibuto Gênero é obrigatório!")
	@Size(min = 5, max= 50)
	private String genero;
	
	@NotBlank(message = "O atibuto Tipo é obrigatório!")
	private String tipo;
	
	@Size(min = 10, max = 150)
	private String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<CategoriaModel> categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<CategoriaModel> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<CategoriaModel> categoria) {
		this.categoria = categoria;
	}
	
	
}
