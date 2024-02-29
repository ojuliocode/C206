public class Main {
    public static void main(String[] args) {
        Personagem abibas = new Personagem(2, 15, 5, 15);
        abibas.andar();
        abibas.correr();

        Personagem abibas2 = new Personagem(4, 5, 2,5);
        System.out.println(abibas2.armadura);
        abibas2.andar(2);
        System.out.println(abibas2);

        Ferramentinhas espada = new Ferramentinhas();


    }
}