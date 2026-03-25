package entities.ex2;

import java.util.ArrayList;
import java.util.List;


public class Banco {

    List<ContaBancaria> lista_contas = new ArrayList<>();

    public ContaBancaria cadastrarCliente(String titular, double saldo){

        int num_conta = lista_contas.size() + 1;

        ContaBancaria conta = new ContaBancaria(titular, num_conta, saldo);
        lista_contas.add(conta);

        return conta;
    }

    public void consultarConta(int num_conta){
        
        if (num_conta < 0 || num_conta >= lista_contas.size()) {
            System.out.println("Erro: Número de conta inválido!");
            return;
        }

        System.out.println("=== CONSULTA CONTA ===");
        System.out.println(lista_contas.get(num_conta).toString());

    }


    public void listarContas() {
        System.out.println("=== LISTA DAS CONTAS ===");
        for (int i = 0; i < lista_contas.size(); i++) {
            System.out.println(lista_contas.get(i).toString());
        }
    }

}
