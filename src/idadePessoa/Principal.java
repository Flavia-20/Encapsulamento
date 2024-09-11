package idadePessoa;

public class Principal {
    public static void main(String[] args) {
        Idade idade = new Idade();

        /*idade.setIdade(45);
        idade.setNome("Jose");

        System.out.println(idade.getNome());
        idade.getIdade();*/


        Idade idade2 = new Idade();
        idade2.setIdade(15);
        idade2.setNome("Joefino");
        System.out.println(idade2.getNome());
        idade2.getIdade();
    }

}
