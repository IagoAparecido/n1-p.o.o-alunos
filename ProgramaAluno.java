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

    aluno.disciplinas.nome[0] = "P.O.O";
    aluno.disciplinas.professor[0] = "Leticia";

    aluno.disciplinas.nome[1] = "Engenharia de Software";
    aluno.disciplinas.professor[1] = "Tanganeli";

    aluno.disciplinas.nome[2] = "Metodologia de Desenvolvimento de Sistema";
    aluno.disciplinas.professor[2] = "Tanganeli";

    aluno.disciplinas.nome[3] = "Redes de Computadores I";
    aluno.disciplinas.professor[3] = "Rafael";

    aluno.disciplinas.nome[4] = "Projeto Interdisciplinar II";
    aluno.disciplinas.professor[4] = "Leticia";

    System.out.println("Dados do Aluno:");
    System.out.println("------------------");
    System.out.println(aluno.ResumoAluno());
    System.out.println("\n");
  
    System.out.println("Disciplinas");
    System.out.println("------------------");

    System.out.println(aluno.disciplinas.resulmoDisciplinas());
    }
}
