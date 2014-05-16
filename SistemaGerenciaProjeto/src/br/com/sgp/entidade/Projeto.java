package br.com.sgp.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "projeto")
public class Projeto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(sequenceName = "seq_objref_projeto", initialValue = 1, allocationSize = 1, name = "objref_projeto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "objref_projeto")
	private Integer objref;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	public Projeto() {

	}

	public Projeto(Integer objref, String nome, String descricao) {
		super();
		this.objref = objref;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Integer getObjref() {
		return objref;
	}

	public void setObjref(Integer objref) {
		this.objref = objref;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
