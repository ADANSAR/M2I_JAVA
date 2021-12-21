package pokemon;

public class PokemonFeu extends Pokemon {

    public PokemonFeu() {
        // default constructor
    }

    public PokemonFeu(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public PokemonType getType() {
        return PokemonType.FEU;
    }

    @Override
    public void attaquer(Pokemon p) {
        switch (p.getType()) {
        case PLANTE:
            if (p.getHp() < getAtk() * 2) {
                p.setHp(0);
            } else {
                p.setHp(p.getHp() - getAtk() * 2);

            }
            break;
        case EAU:
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
