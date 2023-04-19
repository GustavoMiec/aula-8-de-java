package br.com.fiapbeans;

import javax.swing.JOptionPane;

import br.com.fiap.main.Colaborador;

public class Teste {
	
	
	public static void main(String[]args){
	
		Colaborador objColaborador = new Colaborador(JOptionPane.showInputDialog("Digite o nome"), 
				Double.parseDouble(JOptionPane.showInputDialog("Digite o valor hora ")), 
				JOptionPane.showInputDialog("Cargo"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a quantididade de horas")),
				Double.parseDouble(JOptionPane.showInputDialog("informe persentual de imposto de renda")));
			
			System.out.println("informações do colaborador");
			System.out.println(objColaborador.getExibirTudo());
			
			//System.out.println("\nSalario" + objColaborador.calcularSalario(55)); 
			//System.out.println("\nImposto de Renda" + objColaborador.calculoIr(80, 12));
			
			System.out.println(objColaborador.calcularIr());
			System.out.println(objColaborador.calcularSalario());
			
			System.out.println("\nInformações do salario: " + objColaborador.informacaoSalario());
	}
	
		
		
		
