package uib;

public class Conta {

	public String numero;
	public double saldo;

	public Cliente donoDaConta;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getDonoDaConta() {
		return donoDaConta;
	}

	public void setDonoDaConta(Cliente donoDaConta) {
		this.donoDaConta = donoDaConta;
	}

	
}
