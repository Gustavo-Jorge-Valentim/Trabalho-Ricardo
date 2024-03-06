public class Professor extends Pessoa {

    String aula;
    String formacao;

    public Professor(String nome, int idade, int rg, String aula, String formacao) {
        super(nome, idade, rg);
        this.aula = aula;
        this.formacao = formacao;
    }

    public Professor(String nome, int idade, int rg) {
        super(nome, idade, rg);
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome() {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public int getRg() {
        return rg;
    }

    @Override
    public void setRg(int rg) {
        this.rg = rg;
    }
}

