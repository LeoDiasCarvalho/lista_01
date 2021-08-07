/**
 * 
 */
package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionarios;

/**
 * @author leo_dias
 *
 */
public class Programa {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> lista = new ArrayList<>();
		Funcionarios func = new Funcionarios();
		
		System.out.print("Quantos funcionários deseja cadastrar: ");
		int quant = sc.nextInt();
		
		for(int i = 0; i < quant; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			func = new Funcionarios(id, nome, salario);
			lista.add(func);
		}
		
		System.out.println();
		System.out.println("     Lista de Funcionários     ");
		for(Funcionarios x: lista) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
