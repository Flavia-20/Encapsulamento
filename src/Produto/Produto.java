package Produto;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double setPreco(double preco) {
        if(preco > 50){
            double desconto = preco*(0.1);
            //return this.preco = preco / 0.90;
            System.out.println(desconto);
            return desconto;
        } else {
            return this.preco = preco;
        }
    }
}
