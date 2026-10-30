public class Filme implements Comparable<Filme> {
    private String titulo;
    private int ano;
    private double nota;

    public Filme(String titulo, int ano, double nota){
        this.titulo = titulo;
        this.ano = ano;
        this.nota = nota;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public int getAno(){
        return this.ano;
    }

    public void setNota(double nota){
        this.nota = nota;
    }

    public double getNota(){
        return this.nota;
    }

    @Override
    public int compareTo(Filme outro){
        return Double.compare(outro.getNota(),this.getNota());
    }

    @Override
    public String toString() {
        return titulo + " (" + ano + ") - Nota: " + nota;
    }
}