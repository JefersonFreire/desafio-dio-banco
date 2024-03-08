package conta;

public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, double limiteChequeEspecial){
        super(numero);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

}
