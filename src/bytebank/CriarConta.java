package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //Estamos criando uma nova conta
		primeiraConta.Saldo = 200;
		System.out.println(primeiraConta.Saldo);
		
		primeiraConta.Saldo +=100;
		primeiraConta.agencia = 156;
		System.out.println(primeiraConta.Saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.Saldo = 300;
		System.out.println("A primeira conta tem "+primeiraConta.Saldo);
		System.out.println("A segunda conta tem "+segundaConta.Saldo);
		
		segundaConta.agencia = 146;
		
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("mesma conta ");
		}
		else {
			System.out.println("contas diferentes");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
	}

}
