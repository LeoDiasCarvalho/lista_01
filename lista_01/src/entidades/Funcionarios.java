/**
 * 
 */
package entidades;

import java.util.List;

/**
 * @author leo_dias
 *
 */
public class Funcionarios {
	
	private int id;
	private String nome;
	private double salario;
	
	public Funcionarios() {
	}

	public Funcionarios(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Nome: " + nome + ", Salário: $" 
				+ String.format("%.2f", salario);
	}
	
	public Boolean verificarId(List<Funcionarios> lista, int id) {
		Funcionarios func = lista.stream().filter(x -> x.id == id).findFirst().orElse(null);
		return func != null;
	}
	
	public double aumentoSalarial(double taxa) {
		return salario += salario * taxa / 100;
	}
	
	 
	
	
	
	

}
