//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa=new Pessoa("Fabricio", 37, 131266958);
        Motorista motorista=new Motorista("Carlos",48,266985187,"Categoria D", "Caminhão");
        Dentista dentista=new Dentista("Joice",26,363259879,91020804,"Sim, Atendimento Particular");
        Professor professor=new Professor("Ricardo", 32,852302035,"Programação II","Mestre Dos Magos");
        Aluno aluno=new Aluno ();

        System.out.println("Nome da Pessoa:" + pessoa.getNome() + ("\nIdade:"+ pessoa.getIdade()) + ("\nPortador do Rg:" + pessoa.getRg()));
        System.out.println("\n\nNome do Motorista:" + motorista.getNome() + ("\nIdade:" + motorista.getIdade()) + ("\nPortador do Rg:" + motorista.getRg()) + ("\nCateira de Motorista:" + motorista.getCarteiraMotorista()) + ("\nVeículo:" + motorista.getVeiculo()));
        System.out.println("\n\nNome da Dentista:" + dentista.getNome() + ("\nIdade:" + dentista.getIdade()) + ("\nPortadora do Rg:" + dentista.getRg()) + ("\nNumero da Licença:"+ dentista.getNumeroLicenca()) + ("\nAutonoma:" + dentista.getAutonomo()));
        System.out.println("\n\nNome do Professor:" + professor.getNome() + ("\nIdade:" + professor.getIdade()) + ("\nPortador do RG:" + professor.getRg()) + ("\nAula de:" + professor.getAula()) + ("\nFormação:" + professor.getFormacao()));


        System.out.println("\n\nNome do Aluno:" + aluno.nome() + ("\nIdade:" + aluno.idade) + ("\nMatéria:" + aluno.materia()) + ("\nNota do Aluno:" + aluno.nota()));

        System.out.println("\n\nDiga oque o Professor Ricardo irá fazer por ser seu amigo:" + aluno.ricardo() );


    }
}

