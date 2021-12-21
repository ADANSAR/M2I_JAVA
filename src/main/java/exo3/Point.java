package exo3;

public class Point {

    private double x;
    private double y;

    public Point() {
        // default constructor
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        x = p.x;
        y = p.y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public double distance(Point p) {
        double dx = x - p.x;
        double dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean sameAs(Point p) {
        return x == p.x && y == p.y;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x
     *            the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y
     *            the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

}
