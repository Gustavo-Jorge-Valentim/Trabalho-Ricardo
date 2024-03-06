public class Pessoa {

    public String nome ;
    public int idade;
    public int rg;


    public Pessoa (String nome, int idade, int rg) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
}
