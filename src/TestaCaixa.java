public class TestaCaixa {
    public static void main(String[] args){
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Aulas de Java");
        String texto = caixaTexto.retirar();
        System.out.println("Texto guardado: " + texto);

        Caixa<Double> caixaValor = new Caixa<>();
        caixaValor.guardar(255.68);
        Double valor = caixaValor.retirar();
        System.out.println("Valor guardado: " + valor);

        //caixaTexto.guardar(100.0);
    }
}
