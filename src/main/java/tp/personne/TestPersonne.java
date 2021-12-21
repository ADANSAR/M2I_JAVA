package tp.personne;

public class TestPersonne {

    public TestPersonne() {
        // default constructor
    }

    public static void main(String[] args) {
        Personne john = new Personne();
        Personne marc = new Personne("Dupont", "Marc", 41, Sexe.MALE);
        Personne sophie = new Personne("Dupont", "Sophie", 38, Sexe.FEMALE);

        System.out.println(john);
        System.out.println(marc);
        System.out.println(sophie);

        System.out.println("La personne la plus agée est :");
        System.out.println(john.oldest(marc).oldest(sophie));

        boolean marcSophieHasSameName = marc.sameLastName(sophie);
        boolean johnSophieHasSameName = john.sameLastName(sophie);

        if (marcSophieHasSameName) {
            System.out.print(marc);
            System.out.print(" a le même nom que ");
            System.out.println(sophie);
        } else {
            System.out.print(marc);
            System.out.print(" n'a pas le même nom que ");
            System.out.println(sophie);
        }

        if (johnSophieHasSameName) {
            System.out.print(john);
            System.out.print(" a le même nom que ");
            System.out.println(sophie);
        } else {
            System.out.print(john);
            System.out.print(" n'a pas le même nom que ");
            System.out.println(sophie);
        }

    }
}
