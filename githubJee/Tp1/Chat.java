public class Chat extends Animal implements Domestique {

    public Chat(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void parler() {
        System.out.println(nom + " dit : Meow ");
    }

    @Override
    public void jouer() {
        System.out.println(nom + " joue avec ses chatons.");
    }
}

