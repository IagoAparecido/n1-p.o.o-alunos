public class Disciplinas {
  String[] nome = new String[(5)];
  String[] professor = new String[(5)];
  boolean aprovado;

String resulmoDisciplinas() {
  for (int i = 0; i < 5; i++) {
        System.out.println("Materia: " + nome[i] + "\nProfessor da materia: " + professor[i] + "\n");
      };
      return " ";
};
}
