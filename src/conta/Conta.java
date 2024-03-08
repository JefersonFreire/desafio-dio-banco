package conta;

public class Conta {
    private int numero;
    protected double saldo;

    public Conta(int numero){
        this.numero = numero +1;
        this.saldo = 0.0;
    }

    public boolean saque(double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public boolean transferencia(Conta contaDestino, double valor){
        if(this.saque(valor)){
            contaDestino.deposito(valor);
            return true;
        }
        return false;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
