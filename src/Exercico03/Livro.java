package Exercico03;

public class Livro {
    private String titulo;
    private String autor;
    private int numPag;

    public Livro(String titulo, String autor, int numPag) {
        this.titulo = "Senhor dos aneis";
        this.autor = "Salim";
        this.numPag = 509;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
}




