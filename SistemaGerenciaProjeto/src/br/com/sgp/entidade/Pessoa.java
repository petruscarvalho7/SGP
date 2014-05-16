package br.com.sgp.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;

import com.sun.istack.internal.Nullable;

@Entity(name = "pessoa")
public class Pessoa implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(sequenceName = "seq_objref_pessoa", initialValue = 1, allocationSize = 1, name = "objref_pessoa")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "objref_pessoa")
	private Integer objref;
	
	@Column
	private String nome;
	
	@Column
	private String email;
	
	@Column
	private String funcao;
	
	@JoinColumn(name="objref_projeto")
	@Nullable
	private Projeto projeto;

	public Pessoa() {

	}

	public Pessoa(Integer objref, String nome, String email, String funcao, Projeto projeto) {
		super();
		this.objref = objref;
		this.nome = nome;
		this.email = email;
		this.funcao = funcao;
		this.projeto = projeto;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
}
