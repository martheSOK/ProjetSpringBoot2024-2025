public class Chien extends Animal implements Domestique {

    public Chien(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void parler() {
        System.out.println(nom + " dit : Woof");
    }

    @Override
    public void jouer() {
        System.out.println(nom + " joue avec ses chiots.");
    }
}

