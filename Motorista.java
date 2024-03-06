public class Motorista extends Pessoa{

String CarteiraMotorista;
 String veiculo;


    public Motorista(String nome, int idade, int rg, String carteiraMotorista, String veiculo) {
        super(nome, idade, rg);
        CarteiraMotorista = carteiraMotorista;
        this.veiculo = veiculo;
    }

    public String getCarteiraMotorista() {
        return CarteiraMotorista;
    }

    public void setCarteiraMotorista(String carteiraMotorista) {
        CarteiraMotorista = carteiraMotorista;
    }

    public String getVeiculo() {
        return veiculo;
    }


    public void setPlaca(String veiculo) {
        this.veiculo = veiculo;
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
        this.rg =rg;
    }
}
