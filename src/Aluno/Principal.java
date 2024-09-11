package Aluno;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        int nota1 = 9;
        int nota2 = 8;
        int nota3 = 7;
        int nota4 = 9;

        int resultado = aluno.media(nota1, nota2, nota3, nota4);
        System.out.println(resultado);


    }
}
