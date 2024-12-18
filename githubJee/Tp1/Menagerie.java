import java.util.ArrayList;
import java.util.List;

public class Menagerie<T extends Animal> {
    private List<T> animaux;

    public Menagerie() {
        animaux = new ArrayList<>();
    }

    // Ajouter un animal à la ménagerie
    public void ajouterAnimal(T animal) {
        animaux.add(animal);
        System.out.println(animal.getNom() + " a été ajouté à la ménagerie.");
    }

    // Afficher tous les animaux de la ménagerie
    public void afficherAnimaux() {
        for (T animal : animaux) {
            System.out.println("Nom: " + animal.getNom() + ", Âge: " + animal.getAge());
            animal.parler();
        }
    }
}
