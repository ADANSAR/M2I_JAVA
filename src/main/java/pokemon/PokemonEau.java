package pokemon;

public class PokemonEau extends Pokemon {

    public PokemonEau() {
        // TODO Auto-generated constructor stub
    }

    public PokemonEau(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }

    @Override
    public PokemonType getType() {
        return PokemonType.EAU;
    }

    @Override
    public void attaquer(Pokemon p) {
        switch (p.getType()) {
        case FEU:
            if (p.getHp() < getAtk() * 2) {
                p.setHp(0);
            } else {
                p.setHp(p.getHp() - getAtk() * 2);

            }
            break;
        case PLANTE:
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
