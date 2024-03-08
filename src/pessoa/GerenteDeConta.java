package pessoa;

import conta.Conta;

import java.util.ArrayList;

public class GerenteDeConta {
    private String nome;
    private String cargo;
    private ArrayList<Cliente> clientes;

    public GerenteDeConta(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente){
        if(!clientes.contains(cliente)){
            clientes.add(cliente);
            System.out.println("Cliente "+cliente.getNome()+ " cadastrado com sucesso.");
        }else {
            System.out.println("Cliente já cadastrado.");
        }
    }
    public void abrirConta(Cliente cliente, Conta conta){
        if(!clientes.contains(cliente)){

        }
    }
}
