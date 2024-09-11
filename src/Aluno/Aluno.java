package Aluno;

public class Aluno {

    private String nome;
    private double notas;


    public int media(int nota1, int nota2, int nota3, int nota4){
        int media = (nota1 + nota2 + nota3 + nota4) /4;
        return media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }
}
