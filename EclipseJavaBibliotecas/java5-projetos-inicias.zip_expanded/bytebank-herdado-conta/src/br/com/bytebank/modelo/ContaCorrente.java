package br.com.bytebank.modelo;

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {
	
	private static final long serialVersionUID = 1L;

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.2;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }

	@Override
	public double getValorImposto() {	
		return super.saldo * 0.01;
	}
	public void especifico() {
		System.out.println("especifico pra caralho");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ContaCorrente, " + super.toString();
	}
	
}
