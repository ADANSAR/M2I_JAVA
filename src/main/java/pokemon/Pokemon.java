package pokemon;

public class Pokemon implements isAPokemon {

    private String nom;
    private int hp;
    private int atk;

    public Pokemon() {
        // default constructor
    }

    /**
     * @param nom
     * @param hp
     * @param atk
     */
    public Pokemon(String nom, int hp, int atk) {
        super();
        this.nom = nom;
        this.hp = hp;
        this.atk = atk;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @return the atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param hp
     *            the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @param atk
     *            the atk to set
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    public boolean isDead() {
        return hp == 0;
    }

    public void attaquer(Pokemon p) {
        if (p.getHp() < getAtk()) {
            p.setHp(0);
        } else {
            p.setHp(p.getHp() - getAtk());
        }
    }

    public PokemonType getType() {
        return PokemonType.NORMAL;
    }

    @Override
    public String toString() {
        return "Pokemon " + nom + " avec " + hp + " HP";
    }

}
