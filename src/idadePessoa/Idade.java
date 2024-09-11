package idadePessoa;

public class Idade {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        if(idade < 18){
            System.out.println("Voce é menor de idade");
        }else{
        System.out.println("Voce é maior de idade");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
