package br.com.sgp.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.sun.istack.internal.Nullable;

@Entity(name = "escopo")
public class Escopo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(sequenceName = "seq_objref_escopo", initialValue = 1, allocationSize = 1, name = "objref_escopo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "objref_escopo")
	private Integer objref;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="objref_projeto")
	@Nullable
	private Projeto projeto;

	@ManyToOne
	@JoinColumn(name="objref_escopo")
	@Nullable
	private Escopo escopo;
	
	public Escopo() {

	}

	public Escopo(Integer objref, String nome, String descricao, Projeto projeto, Escopo escopo) {
		super();
		this.objref = objref;
		this.nome = nome;
		this.descricao = descricao;
		this.projeto = projeto;
		this.escopo = escopo;
	}

	public Escopo getEscopo() {
		return escopo;
	}

	public void setEscopo(Escopo escopo) {
		this.escopo = escopo;
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



	public Projeto getProjeto() {
		return projeto;
	}



	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	
}
