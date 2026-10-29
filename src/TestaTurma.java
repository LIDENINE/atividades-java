public class TestaTurma{
    static void main(String[] args) {
        Estudante[] turma = new Estudante[3];
        turma[0] = new Estudante("Carlos", 6.5);
        turma[1] = new Estudante("Tayná", 7.9);
        turma[2] = new Estudante("Simon", 8.1);

        Estudante[] turmaCopia = Estudante.clonarTurma(turma);

        turmaCopia[0].setNota(10);

        System.out.println(turma[0].getNota());
        System.out.println(turmaCopia[0].getNota());
    }
}
