package Exercicio04;

public class Pessoa {
    private String nome;
    private String cidadeDeNascimento;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidadeDeNascimento() {
        return cidadeDeNascimento;
    }

    public void setCidadeDeNascimento(String cidadeDeNascimento) {
        this.cidadeDeNascimento = cidadeDeNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, String cidadeDeNascimento, int idade) {
        this.nome = nome;
        this.cidadeDeNascimento = cidadeDeNascimento;
        this.idade = idade;
    }
}
