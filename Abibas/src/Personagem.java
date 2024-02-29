public class Personagem {
    public int vida;
    public int fome;
    public int armadura;
    public float xp;

    public Ferramentinhas ferramenta;
    public void correr(){
        System.out.println("Correndoooo \uD83C\uDFC3");
    }

    public void andar(){
        System.out.println("Andando \uD83C\uDFC3");
    }

    public void andar(int n){
        System.out.println("Andando a " + n +" km");
    }

    public String toString(){
        return "Vida: " + this.vida + "\n" + "Armor: " + this.armadura + "\n" +"Fome: " + this.fome + "\n" ;
    }

public void addFerramenta(Ferramentinhas ferramenta){

}
    Personagem(int vida, int armadura, int fome, float xp, Ferramentinhas ferramenta){
        this.vida = vida;
        this.armadura = armadura;
        this.fome = fome;
        this.xp = xp;
        System.out.println("Abibas");
    }

    Personagem(int armadura, int vida, int fome, int xp){
        this.armadura = armadura;
        this.vida = vida;
        this.fome = fome;
        this.xp = xp;
        System.out.println("Abibas segundo");
    }
}
