package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
	Conta contaDoPaulo = new Conta();
	contaDoPaulo.Saldo = 100;
	
	contaDoPaulo.deposita(50);//Usando método de depositar
	
	System.out.println(contaDoPaulo.Saldo);
	
	boolean conseguiRetirar = contaDoPaulo.saca(20);//Fazemos isso para retornar o resultado booblean pois caso contrario veriamos apenas o valor
	System.out.println(conseguiRetirar);
	System.out.println(contaDoPaulo.Saldo);
	
	Conta contaDaMarcela = new Conta();
	contaDaMarcela.deposita(1000);
	
	boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoPaulo);
	if(sucessoTransferencia) {//O método está recebendo apenas a referencia do objeto e nao o objeto em si
		System.out.println("transferencia com sucesso");
	}
	else {
		System.out.println("faltou dinheiro");
	}
	System.out.println(contaDaMarcela.Saldo);
	System.out.println(contaDoPaulo.Saldo);
	
	//contaDoPaulo.titular = "Paulo Silveira";
	System.out.println(contaDoPaulo.titular);
	
	}
}
