public class TestarArray {
    public static void main(String[] args){
        Carro[] garagem = new Carro[3];

        garagem[0] = new Carro("Toyota","Corolla",2022);
        garagem[1] = new Carro("Honda","Civic",2021);
        garagem[2] = new Carro("Ford","Ka",2019);

        for (Carro c: garagem){
            System.out.println("Marca: "+ c.getMarca() + " | Modelo: " + c.getModelo() + " | Ano - "+ c.getAno());
        }

        Carro meuCarro = garagem[0];
        meuCarro.setAno(2025);
        System.out.println(garagem[0].getAno());
        //O valor mostrado no console é 2025, pois quando atribuimos o valor de garagem[0] para meuCarro, copiamos apenas a Referência do Objeto
        // Nenhuma variável armazena um Objeto em Java. O valor contido é um "endereço" do Objeto. Assim, quando alteramos o atributo "ano" da variável "MeuCarro", na realidade alteramos o valor do atributo do Objeto que a Referência aponta.


    }
}