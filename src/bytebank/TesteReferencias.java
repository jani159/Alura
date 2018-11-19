package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		
	Conta primeiraConta = new Conta();
	primeiraConta.Saldo = 300;
	
	System.out.println("saldo da primeira: "+primeiraConta.Saldo);
	
	Conta segundaConta = primeiraConta; //Neste caso "segundaConta"recebe o mesmo endereco de memoria que a primeiraConta, apontando pra mesma conta.
	System.out.println("saldo da segunda: "+segundaConta.Saldo);
	
	segundaConta.Saldo += 100; //Quando alteramos estamos alterando as duas referencias.
	System.out.println("saldo da segunda: "+segundaConta.Saldo);
	
	System.out.println("saldo da primeira: "+primeiraConta.Saldo);
	
	if(primeiraConta == segundaConta) {
		System.out.println("sao a mesmissima conta");
	}
	//Aparecerão as mesmas referencias
	System.out.println(primeiraConta);
	System.out.println(segundaConta);
	
	
	}
}
