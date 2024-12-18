public class Main {
    public static void main(String[] args) {

        Menagerie<Animal> menagerie = new Menagerie<>();

        Chien chien = new Chien("Loulou", 5);
        Chat chat = new Chat("Mimi", 3);

        // Ajout des animaux à la ménagerie
        menagerie.ajouterAnimal(chien);
        menagerie.ajouterAnimal(chat);

        // Affichage des animaux de la ménagerie
        menagerie.afficherAnimaux();

        // Interaction avec les animaux
        chien.manger();
        chat.manger();

        chien.jouer();
        chat.jouer();
    }
}
