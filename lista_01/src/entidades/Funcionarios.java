/**
 * 
 */
package entidades;

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
	
	
	
	
	
	

}
