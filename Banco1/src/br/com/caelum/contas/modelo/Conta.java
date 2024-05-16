package br.com.caelum.contas.modelo;



public class Conta {
	protected double saldo;
	private String titular, agencia;
	private int numero;
	
	public String getTipo() {
	    return "Conta";
	}

	public void saca(double valor) {
		this.saldo = this.saldo - valor;
	}

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	public void transfere(double valor, Conta conta) {
	    this.saca(valor);
	    conta.deposita(valor);
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}
	@Override
	  public String toString() {
	        return "[Titular = " + titular.toUpperCase() + ", Número = "
	          + numero + ", Agência=" + agencia + "]";
	    }
	//Test
}
