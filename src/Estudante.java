public class Estudante {
    private String nome;
    private double nota;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public double getNota(){
        return this.nota;
    }

    public Estudante(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public static Estudante[] clonarTurma(Estudante[] original){
        Estudante[] copia = new Estudante[original.length];
        for (int p = 0; p < original.length; p++){
            if (original[p] != null){
                copia[p] = new Estudante(original[p].getNome(), original[p].getNota());
            }
        }
        return copia;
    }
}
