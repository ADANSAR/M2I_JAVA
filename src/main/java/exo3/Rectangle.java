package exo3;

public class Rectangle {

    private Point base; // Base en bas à gauche
    private double xlength; // Dimension horizontale
    private double ylength; // Dimension verticale

    public Rectangle(Point base, Point another) {
        this(base, another.getX() - base.getX(), another.getY() - base.getY());
    }

    public Rectangle(Point base, double xlength, double ylength) {
        if (xlength < 0 || ylength < 0) {
            double xbase = base.getX();
            double ybase = base.getY();
            if (xlength < 0) {
                xlength = -xlength;
                xbase = base.getX() - xlength;
            }
            if (ylength < 0) {
                ylength = -ylength;
                ybase = base.getY() - ylength;
            }
            // on crée un nouveau point de base du rectangle
            base = new Point(xbase, ybase);
        }
        // mise en place du point de base et des dimensions
        this.base = base;
        this.xlength = xlength;
        this.ylength = ylength;
    }

    public Rectangle(double x, double y, double xlength, double ylength) {
        this(new Point(x, y), xlength, ylength);
    }

    /**
     * @return the base
     */
    public Point getBase() {
        return base;
    }

    /**
     * @param base
     *            the base to set
     */
    public void setBase(Point base) {
        this.base = base;
    }

    /**
     * @return the xlength
     */
    public double getXlength() {
        return xlength;
    }

    /**
     * @param xlength
     *            the xlength to set
     */
    public void setXlength(double xlength) {
        this.xlength = xlength;
    }

    /**
     * @return the ylength
     */
    public double getYlength() {
        return ylength;
    }

    /**
     * @param ylength
     *            the ylength to set
     */
    public void setYlength(double ylength) {
        this.ylength = ylength;
    }

    // Calcul de surface du rectangle
    public double surface() {
        return xlength * ylength;
    }

    // Translation du rectangle
    public void translate(double dx, double dy) {
        base.translate(dx, dy);
    }

    // Verifier si un point donné (en paramètre) est à l'intérieur du rectangle.
    public boolean contains(Point p) {
        return base.getX() <= p.getX() && p.getX() <= base.getX() + xlength
                && base.getY() <= p.getY() && p.getY() <= base.getY() + ylength;
    }

    // Vérifier si un rectangle donné est à l'intérieur du rectangle.
    public boolean contains(Rectangle r) {
        return contains(r.base) && r.base.getX() + r.xlength <= base.getX() + xlength
                && r.base.getY() + r.ylength <= base.getY() + ylength;
    }

    // Fonction qui teste l'égalité des deux rectangles
    public boolean sameAs(Rectangle r) {
        return base.sameAs(r.getBase()) && xlength == r.getXlength() && ylength == r.getYlength();
    }

}
