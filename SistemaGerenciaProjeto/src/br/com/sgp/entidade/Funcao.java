package br.com.sgp.entidade;

public class Funcao {
	
	private String nome;
	
	public Funcao(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public Funcao[] getTitulacoes(){
		String[] vet ={"Codificador","Analista","Gerente","Testador"};
		Funcao[] funcoes = new Funcao[vet.length];
		for(int i=0;i<vet.length;i++){
			funcoes[i] = new Funcao(vet[i]);
		}
		return funcoes;
	}


}
