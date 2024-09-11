package Produto;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Sabao");
        produto.setPreco(59);

        System.out.println( produto.getNome());


    }
}
