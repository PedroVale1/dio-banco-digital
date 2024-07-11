import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um banco
        Banco banco = new Banco();
        banco.setNome("Banco XYZ");

        // Criando cliente Venilton
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        // Criando contas para o cliente Venilton
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        // Adicionando as contas ao banco
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(poupanca);
        banco.setContas(contas);

        // Realizando operações nas contas
        cc.depositar(100);
        cc.transferir(100, poupanca);

        // Imprimindo extratos das contas
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Listando os clientes do banco
        List<Cliente> clientes = banco.listarClientes();

        System.out.println("\nClientes do Banco " + banco.getNome() + ":");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
        }
    }
}