package br.com.sgp.entidade;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "atividade")
public class Atividade implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(sequenceName = "seq_objref_atividade", initialValue = 1, allocationSize = 1, name = "objref_atividade")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "objref_atividade")
	private Integer objref;
	
	@Column
	private String nome;
	
	@Column
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="objref_escopo")
	private Escopo escopo;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Calendar dataInicio;
	
	@Temporal(TemporalType.DATE)
	@Column
	private Calendar dataFim;
	
	@JoinColumn(name="objref_pessoa")
	private Pessoa pessoa;

	public Atividade() {
		
	}

	public Atividade(Integer objref, String nome, String descricao,
			Escopo escopo, Calendar dataInicio, Calendar dataFim, Pessoa pessoa) {
		super();
		this.objref = objref;
		this.nome = nome;
		this.descricao = descricao;
		this.escopo = escopo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.pessoa = pessoa;
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

	public Escopo getEscopo() {
		return escopo;
	}

	public void setEscopo(Escopo escopo) {
		this.escopo = escopo;
	}

	public Calendar getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Calendar getDataFim() {
		return dataFim;
	}

	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	
	
}
