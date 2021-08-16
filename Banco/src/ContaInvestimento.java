public class ContaInvestimento extends Conta {

	 String tipoInvestimento;
	 float taxaJuros; 
	 private float total;
	
	
	public ContaInvestimento(int numeroDaConta, Correntista correntista, String tipoInvestimento, float taxaJuros) {
		super(numeroDaConta, correntista);
		this.taxaJuros = taxaJuros;
		this.tipoInvestimento = tipoInvestimento;
		if (correntista.getContaCorrente() == null){
            throw new RuntimeException("Correntista sem conta corrente!");
		}
	}
	public float AplicarJuros(float taxaJuros, String tipoInvestimento) {
		 taxaJuros = 1 + (taxaJuros/100);
		 total = ((total + this.getSaldoEmReais())*taxaJuros)- this.getSaldoEmReais();
		
		return total;
	}
	public void  resgatarTotal() {
		this.receberDepositoEmDinheiro(total);
		
	}
	
	
	
}
