package bytebank;

public class Conta {
	
//Criacao de atributos
	protected double Saldo;
	protected int agencia = 42;
	protected int numero;
	protected Cliente titular; //Composicao de uma Classe 
	
	public void deposita(double valor) {
		this.Saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.Saldo >= valor) {
			this.Saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.Saldo >= valor) {
			this.Saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		else {
			return false;
		}
	}
}
