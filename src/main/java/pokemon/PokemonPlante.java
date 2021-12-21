package pokemon;

public class PokemonPlante extends Pokemon {

    public PokemonPlante() {
        // default constructor
    }

    public PokemonPlante(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public PokemonType getType() {
        return PokemonType.PLANTE;
    }

    @Override
    public void attaquer(Pokemon p) {
        switch (p.getType()) {
        case EAU:
            if (p.getHp() < getAtk() * 2) {
                p.setHp(0);
            } else {
                p.setHp(p.getHp() - getAtk() * 2);

            }
            break;
        case FEU:
            if (p.getHp() < getAtk() / 2) {
                p.setHp(0);
            } else {
                p.setHp(p.getHp() - getAtk() / 2);

            }
            break;
        default:
            if (p.getHp() < getAtk()) {
                p.setHp(0);
            } else {
                p.setHp(p.getHp() - getAtk());

            }
            break;
        }
    }

}
