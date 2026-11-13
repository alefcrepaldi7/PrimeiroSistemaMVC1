package projeto.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String identificacao;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario(String nome, String identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void realizarEmprestimo(Livro livro) {
        emprestimos.add(new Emprestimo(livro, this));
    }
}

