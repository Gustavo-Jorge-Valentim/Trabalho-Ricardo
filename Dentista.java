public class Dentista extends Pessoa{

    int NumeroLicenca;

    String autonomo;

    public Dentista(String nome, int idade, int rg, int numeroLicenca, String autonomo) {
        super(nome, idade, rg);
        NumeroLicenca = numeroLicenca;
        this.autonomo = autonomo;
    }

    public int getNumeroLicenca() {
        return NumeroLicenca;
    }

    public void setNumeroLicenca(int numeroLicenca) {
        NumeroLicenca = numeroLicenca;
    }

    public String getAutonomo() {
        return autonomo;
    }

    public void setAutonomo(String autonomo) {
        this.autonomo = autonomo;
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
