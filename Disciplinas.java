public class Disciplinas {
  String[] nome = new String[(5)];
  String[] professor = new String[(5)];
  boolean aprovado;

  void aprovar(boolean aprovado) {
    if (aprovado) {
          System.out.println("Aluno aprovado!");
    } else {
          System.out.println("Aluno reprovado!");
    };

};
String resulmoDisciplinas() {
  for (int i = 0; i < 5; i++) {
        System.out.println("Materia: " + nome[i] + "\nProfessor da materia: " + professor[i] + "\n");
      };
      return " ";
};
}
