package banco;

import conta.ContaCorrente;
import conta.ContaPoupanca;
import pessoa.Cliente;
import pessoa.GerenteDeConta;

public class Banco {
    static public void main(String[] args){
        Cliente cliente1 = new Cliente("jeferson", "Rua vereador jose", "369.369.852-55");
        Cliente cliente2 = new Cliente("Freire", "rua pinheiro", "147.852.258-66");
        ContaCorrente cc1 = new ContaCorrente(1,1000.0);
        ContaCorrente cc2 = new ContaCorrente(2,500);
        ContaPoupanca cp2 = new ContaPoupanca(1,0.03);
        ContaPoupanca cp1 = new ContaPoupanca(2,0.05);

        GerenteDeConta gerente = new GerenteDeConta("Gerente", "Gerente Geral");

        gerente.abrirConta(cliente1, cc1);
        gerente.abrirConta(cliente1, cp1);
        gerente.abrirConta(cliente2, cc2);
        gerente.abrirConta(cliente2,cc2);


        cc1.deposito(500.0);
        cp1.deposito(1000.0);


        System.out.println("Saldo da conta corrente cliente "+cliente1.getNome()+" " + cc1.getSaldo());
        System.out.println("Saldo da conta poupança cliente "+cliente1.getNome()+"  " + cp1.getSaldo());
        System.out.println("Saldo da conta corrente cliente "+cliente2.getNome()+" " + cc2.getSaldo());
        System.out.println("Saldo da conta poupança cliente "+cliente2.getNome()+" " + cp2.getSaldo());

        cc1.transferencia(cc2,250);
        cp1.transferencia(cp2,600);

        System.out.println("Saldo da conta corrente cliente "+cliente1.getNome()+" " + cc1.getSaldo());
        System.out.println("Saldo da conta poupança cliente "+cliente1.getNome()+"  " + cp1.getSaldo());
        System.out.println("Saldo da conta corrente cliente "+cliente2.getNome()+" " + cc2.getSaldo());
        System.out.println("Saldo da conta poupança cliente "+cliente2.getNome()+" " + cp2.getSaldo());

    }

}
