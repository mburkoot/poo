package encapsulamento1;

public class Account {
	
	private int numero;
	private String nome;
	private double saldo;
	
	public Account(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}

	public Account(int numero, String nome, double depositoInicial) {
		this.numero = numero;
		this.nome = nome;
		deposito(depositoInicial); //ver de novo
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valorDeposito) { //deposit amount
		saldo += valorDeposito; //balance amount
	}
	
	public void saque(double valorSaque) {
		saldo -= (valorSaque + 5.0);
	}

	public String toString() {
		return "Account " + numero + ",  Holder: " + nome + ", Balance: $" + String.format("%.2f", saldo);
	}
	
	
}

