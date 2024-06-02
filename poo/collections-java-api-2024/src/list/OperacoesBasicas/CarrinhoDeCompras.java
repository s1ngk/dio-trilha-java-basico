

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {   
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade){
        itemList.add(new Item(nome, preco, quantidade));    
    }

    public void removerItem(String nome, Integer quantidade){
        List<Item> itensParaRemover= new ArrayList<>();
        for (Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
                System.out.println("Item " + i.getNome() + " removido.");
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public Double calcularValorTotal() {
        Double valorTotal = 0.0;
        for (Item i : itemList){
            valorTotal += i.getPreco();
        }
        return valorTotal;
    }
    
    public List<Item> exibirItens() {
        List<Item> itensParaExibir = new ArrayList<>();
        for (Item i : itemList){
            itensParaExibir.add(i);
        }
        return itensParaExibir;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("Os itens no carrinho são: " + carrinho.exibirItens());

        carrinho.adicionarItem("Pão", 2.00, 1);
        carrinho.adicionarItem("Queijo", 4.50, 1);
        carrinho.adicionarItem("Presunto", 3.00, 1);
        carrinho.adicionarItem("Maionese", 6.00, 1);

        System.out.println("Os itens no carrinho são: " + carrinho.exibirItens());
        
        System.out.println("O valor total do carrinho é: " + carrinho.calcularValorTotal());
        
        carrinho.removerItem("Pão", 1);
        
        System.out.println("O valor total do carrinho é: " + carrinho.calcularValorTotal());
    }
}
