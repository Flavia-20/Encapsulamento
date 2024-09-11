package Livro;

public class Livro {
    private String titulo;
    private String autor;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String detalhes(){
        System.out.println("O titulo do livro é: "+this.titulo);
        System.out.println("O autor do livro é: "+this.autor);
        return "";
    }
}
