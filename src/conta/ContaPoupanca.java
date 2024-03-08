package conta;

public class ContaPoupanca extends Conta{
    private double taxaRendimento;

    public ContaPoupanca(int numero, double taxaRendimento){
        super(numero);
        this.taxaRendimento = taxaRendimento;
    }

    public void calcularRendimentoMensal(){
        this.saldo *= getTaxaRendimento();
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
