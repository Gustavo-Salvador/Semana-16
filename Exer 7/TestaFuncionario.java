// Exerc�cio 7
public class TestaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Diretor", 4800.0);
		
		System.out.println("Cargo: " + f1.getCargo());
		System.out.println("Salario: R$" + f1.getSalario());
	}
}
