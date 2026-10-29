public class TestaLivro {
    public static void main(String[] args) {
        Livro[] estante = new Livro[5];

        estante[0] = new Livro("Harry Potter: E a Pedra Filosofal",264);
        estante[2] = new Livro("A Hora da Estrela",88);
        estante[4] = new Livro("O Pequeno Principe",96);

        for (int p = 0; p < estante.length; p++){
            if (estante[p] != null){
                System.out.println("Título: " + estante[p].getTitle() +" | Páginas: " + estante[p].getPages());
            } else {
                System.out.println("A posição " + p + "está vazia.");
            }
        }
    }
}
