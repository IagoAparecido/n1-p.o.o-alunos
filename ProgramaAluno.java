public class ProgramaAluno {

  //Requesitos:
  //    O aluno deve ter nome(String), idade(int), ra(int), sobrenome(String), curso(String), semestre(String)
  public static void main(String[] args) {
    Aluno aluno = new Aluno();

    aluno.nome = "Iago";
    aluno.sobrenome = "Ferreira";
    aluno.idade = 20;
    aluno.ra = 73780;
    aluno.semestre = 3;

    aluno.curso.nome = "Analise e Desenvolvimento de Sistemas";
    aluno.curso.coordenador = "Elizeu";

    System.out.println("Dados do Aluno:");
    System.out.println("------------------");
    System.out.println(aluno.ResumoAluno());
    System.out.println("------------------");

  } 


}
