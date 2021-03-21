package br.com.blueclover.model

class Conta(
	val titular : String,
	val numero: Int) {
	
	var saldo   = 0.0
		private set(valor){
			if(valor > 0){
				field = valor;
			}
		}
	
	fun deposita(valor : Double){
		this.saldo += valor;
	}
	
	fun saca(valor: Double) : Boolean {
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	fun transfere(target: Conta, valor: Double) : Boolean{
		
		if(saca(valor)){
			target.deposita(valor);
			return true;
		}
			
		return false;
	}
}