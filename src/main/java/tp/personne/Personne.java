package tp.personne;

public class Personne {

    // son nom, son prénom, son âge et son sexe
    private String nom;
    private String prenom;
    private int age;
    private Sexe sexe;

    public Personne() {
        nom = "Doe";
        prenom = "John";
        age = 30;
        sexe = Sexe.MALE;
    }

    public Personne(String nom, String prenom, int age, Sexe sexe) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the sexe
     */
    public Sexe getSexe() {
        return sexe;
    }

    /**
     *
     * @param p
     *            la deuxième personne avec laquelle on va comparer
     * @return vrai si les deux personnes ont le même nom, faux sinon.
     */
    public boolean sameLastName(Personne p) {
        return nom.equals(p.getNom());
    }

    /**
     *
     * @param p
     *            la deuxième personne avec laquelle on va comparer
     * @return retourne la personne la plus âgée
     */
    public Personne oldest(Personne p) {
        return age >= p.getAge() ? this : p; // operation ternaire => uneVariable = condition?si_vrai:si_faux;
    }

    @Override
    public String toString() {
        return "Personne qui s'appelle " + nom + " " + prenom + " et qui a " + age
                + "ans et de sexe " + sexe.name();
    }

}
