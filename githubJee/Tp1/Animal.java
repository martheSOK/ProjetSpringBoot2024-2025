
public abstract class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode abstraite parler()
    public abstract void parler();

    // Méthode concrète manger()
    public void manger() {
        System.out.println(nom + " mange.");
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }
}
