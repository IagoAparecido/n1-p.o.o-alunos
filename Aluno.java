public class Aluno {
  String nome;
  String sobrenome;
  int idade;
  int ra;
  String curso;
  int semestre;

  String ResumoAluno() {
    return nome + " " + sobrenome + "\n" + idade + " anos" + "\n" + ra + "\n" + curso + "\n" + semestre + " semestre";
  }
}