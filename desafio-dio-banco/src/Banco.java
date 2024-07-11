import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Cliente> listarClientes() {
        Set<Cliente> clientes = new HashSet<>();
        
        for (Conta conta : contas) {
            clientes.add(conta.getCliente());
        }
        
        return new ArrayList<>(clientes); // 
    }
}