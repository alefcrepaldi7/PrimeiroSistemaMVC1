package projeto.biblioteca.model;

public class Autor {
    private String nome;
    private String nacionalidade;
    private int obrasPublicadas;

    public Autor(String nome, String nacionalidade, int obrasPublicadas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = obrasPublicadas;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setObrasPublicadas(int obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }
}
