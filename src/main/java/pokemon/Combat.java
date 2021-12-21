package pokemon;

public class Combat {

    public static void main(String[] args) {
        Pokemon rattata = new Pokemon("Rattata", 20, 6);
        PokemonFeu salameche = new PokemonFeu("Salameche", 18, 7);
        PokemonEau carapuce = new PokemonEau("Carapuce", 24, 4);
        PokemonPlante bulbizarre = new PokemonPlante("Bulbizarre", 22, 5);
        System.out.println(
                "Le combat entre " + rattata.getNom() + " et " + salameche.getNom() + "commence !");
        System.out.println(rattata.toString() + "-" + salameche.toString());
        System.out.println(rattata.getNom() + " attaque " + salameche.getNom());
        rattata.attaquer(salameche);
        System.out.println(rattata.toString() + "-" + salameche.toString());
    }
}
