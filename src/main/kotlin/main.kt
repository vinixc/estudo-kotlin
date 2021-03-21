import br.com.blueclover.model.Conta

fun main(){
	
	val contaVinicius = Conta(titular = "Vinicius de Carvalho", numero = 1000);
	contaVinicius.deposita(100.0);
	
	val contaYasmin = Conta(titular = "Yasmin Carvalho", numero = 1001);
	contaYasmin.deposita(100.0);
	
	println("TITULAR : ${contaVinicius.titular} | NUMERO CONTA: ${contaVinicius.numero} | SALDO: ${contaVinicius.saldo}")
	println("TITULAR : ${contaYasmin.titular} | NUMERO CONTA: ${contaYasmin.numero} | SALDO: ${contaYasmin.saldo}")
	
	println("DEPOSITANDO NA CONTA DO VINICIUS")
	contaVinicius.deposita(60.0);
	println(contaVinicius.saldo);
	
	println("SACANDO NA CONTA DO VINICIUS")
	contaVinicius.saca(50.0);
	println(contaVinicius.saldo);
	
	
	println("ANTES DA TRANSFERENCIAS");
	printaDadosConta(contaVinicius);
	printaDadosConta(contaYasmin);
	
	println("TRANSFERINDO PARA YASMIN")
	println();
	if(!contaVinicius.transfere(contaYasmin, 10.0)){
		println("NAO FOI POSSIVEL REALIZAR A TRANSFERENCIA");
	}
	
	println("DEPOIS DA TRANSFERENCIAS");

	printaDadosConta(contaVinicius);
	printaDadosConta(contaYasmin);
	
}

fun printaDadosConta(conta: Conta){
	println("TITULAR: ${conta.titular}")
	println("NUMERO:  ${conta.numero}")
	println("SALDO:   ${conta.saldo}")
	println();
}

fun testaCondicoes(saldo: Double){
	when{
		saldo > 0.0 	-> println("Conta é positiva");
		saldo == 0.0 	-> println("Conta é neutra");
		else 			-> println("Conta é negativa");
	}
}

fun testaCopiasEReferencias(){
//	val conta1 = Conta();
//	conta1.titular = "Vinicius de Carvalho";
//	conta1.numero = 1000;
//	conta1.saldo = 100.0;
//	
//	val conta2 = Conta();
//	conta2.titular = "Yasmin Carvalho";
//	conta2.numero = 1001;
//	conta2.saldo = 200.0;
//	
//	println(conta1.titular);
//	println(conta1.numero);
//	println(conta1.saldo);
//	println();
//	println(conta2.titular);
//	println(conta2.numero);
//	println(conta2.saldo);
//	println();
//	
//	val numeroX = 10;
//	var numeroY = numeroX;
//	
//	println(numeroX);
//	println(numeroY);
//	
//	val contaJoao = Conta();
//	contaJoao.titular = "Joao";
//	contaJoao.numero = 1001;
//	contaJoao.saldo = 200.0;
//	
//	var contaMaria = contaJoao;
//	contaMaria.titular = "Maria";
//	
//	println("titular conta joao: ${contaJoao.titular}");
}