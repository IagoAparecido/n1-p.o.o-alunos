public class Disciplinas {
  String[] nome;
  boolean aprovado;

  void aprovar(boolean aprovado) {
    if (aprovado) {
          System.out.println("Aluno aprovado!");
    } else {
          System.out.println("Aluno reprovado!");
    }
}
}
