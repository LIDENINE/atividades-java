public class TestarArray {
    static void main() {
        Carro[] garagem = new Carro[3];
        garagem[0] = new Carro("Toyota","4 portas",2002);
        garagem[1] = new Carro("Tesla","Ruster",2026);
        garagem[2] = new Carro("Brasilha","Motor Dianteiro",1968);

        for (int i = 0; i < garagem.length; i++) {
            System.out.println("Carro "+ (i+1) + ":");
            System.out.println("Marca: " + garagem[i].getMarca());
            System.out.println("Modelo: " + garagem[i].getModelo());
            System.out.println("Ano: "+ garagem[i].getAno());
            System.out.println("------------------------");
        }

        Carro meuCarro = garagem[0];
        meuCarro.setAno(2025);
        System.out.println(garagem[0].setAno());
    }
}
