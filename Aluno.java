public class Aluno {
  String nome;
  String sobrenome;
  int idade;
  int ra;
  int semestre;
  
  Curso curso = new Curso();
  Disciplinas disciplinas = new Disciplinas();

  String ResumoAluno() {
    return "Nome: " +nome + " " + sobrenome + "\n"+ "Idade: " + idade + " anos" + "\n" + "R.A: " + ra + "\n" + "Curso: "+ curso.nome + "\n" + "Coordenador: "+ curso.coordenador + "\n" + semestre + " semestre";
  }
}