// Exerc�cio 7
public class Funcionario {
	private String cargo;
	private double salario;
	
	public Funcionario(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}
	public double getSalario() {
		return salario;
	}
}
