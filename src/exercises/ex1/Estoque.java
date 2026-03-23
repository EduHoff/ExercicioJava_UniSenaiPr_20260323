package exercises.ex1;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private static List<Produto> estoque = new ArrayList<>();

    public static void adicionarProduto(Produto p){
        if(!estoque.contains(p)){
            estoque.add(p);
        }else{
            System.out.println("Produto já registrado!");
        }     
    }

    public static void removerProduto(Produto p){
        estoque.remove(p);
    }

    public static void removerProduto(int index){
        estoque.remove(index);
    }


    public static void venderProduto(int index, int qtd){

        if (index < 0 || index >= estoque.size()) {
            System.out.println("Erro: Código de produto inválido!");
            return;
        }

        if (qtd <= 0) {
            System.out.println("Quantidade precisa ser maior que zero!");
            return;
        }

        if(estoque.get(index).getQtd_estoque() < qtd){
            System.out.println("Não há estoque o suficiente para a venda de " + qtd + " " + estoque.get(index).getNome());
        }else{
            System.out.println("Venda realizada com sucesso de " + qtd + " " + estoque.get(index).getNome() + "!");
            estoque.get(index).setQtd_estoque(estoque.get(index).getQtd_estoque() - qtd);
        }
    }

    public static void atualizarPreco(int index, double preco){

        if (index < 0 || index >= estoque.size()) {
            System.out.println("Erro: Código de produto inválido!");
            return;
        }

        if(preco <= 0){
            System.out.println("Preço precisa ser maior que zero!");
            return;
        }

        System.out.println("Preço do produto " + estoque.get(index).getNome() + " foi atualizado de R$" + estoque.get(index).getPreco() + " para R$" + preco);
        estoque.get(index).setPreco(preco);
    }

    public static void gerarRelatorio() {
        System.out.println("=== RELATÓRIO DE PRODUTOS ===");
        for (int i = 0; i < estoque.size(); i++) {
            System.out.println("Cód: " + i + " | " + estoque.get(i).toString());
        }
    }

}
