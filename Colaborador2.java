package br.com.fiap.main;

public class Colaborador {

	private String nome;
	private double valorHora;
	private String cargo;
	private double percentual;
	private double quantidadedeHoras;
	

	
	public Colaborador(String nome, double valorHora, String cargo,double quantidadedeHoras, double percentual ) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
		this.percentual = percentual;
		this.quantidadedeHoras = quantidadedeHoras;
	}
	
	public Colaborador(String nome, double valorHora, String cargo) {
		super();
		this.nome = nome;
		this.valorHora = valorHora;
		this.cargo = cargo;
		
	}


	public Colaborador() {
		super();
		
	}
	
	
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	public double getQuantidadedeHoras() {
		return quantidadedeHoras;
	}
	public void setQuantidadedeHoras(double quantidadedeHoras) {
		this.quantidadedeHoras = quantidadedeHoras;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public String getCargo() {
		return cargo;
	}
	
	
	public String getExibirTudo(){
		return "nome" + nome + "\nvalorHora " + valorHora + "\nCargo " + cargo;
	}
	
	
	public double calcularSalario(double quantidadeHoras){
		
		return valorHora * quantidadeHoras;
	}
	
	/*public double calculoIr(double quantidadeHoras, double porcentagem ){
		return (valorHora * quantidadeHoras) * (porcentagem /100);
	}*/
	
	public double calcularSalario(){
		return valorHora * quantidadedeHoras;
	}
	
	/*public double calcularIr(){
		double salario;
		salario= calcularSalario() * percentual/100;
		return salario;}*/
		
		public double calcularIr (){
			return (valorHora * quantidadedeHoras) * (percentual/100);
			}
		 
		public String informacaoSalario(){
			String informacao;
			
			
			if(calcularSalario () <= 5755){
				informacao = "quero aumento";
			}else{
				informacao = "Ah ta bão néh!!!";
			}
			return informacao ;
		}
		
	
	}

