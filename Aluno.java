public  class Aluno implements Ialuno {

    public int idade=19;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String nome () {
        return ("Gustavo");
    }

    @Override
    public String ricardo () {
        return ("PROFESSOR RICARDO VAI TE APROVAR !!!");
    }

    @Override
    public String materia() {
        return ("Sistemas");
    }

    @Override
    public int nota() {
        return 87;
    }
}
