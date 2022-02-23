package studentWork.jackson_lafferty;

import java.lang.Math;

public class Point {

    // What are the advantages or disadvantages of making this public vs private?
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Moves x by dx and y by dy.
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Return the distance from this point to p.
    public double distanceFrom(Point p) {
        double dx = Math.pow(getX() - p.getX(), 2);
        double dy = Math.pow(getY() - p.getY(), 2);
        return Math.sqrt(dx + dy);
    }


    // Discussion:
    // What is a field?
    // What is a method?
    // Accessors - conventions; get, return
    // Mutators - conventions; set, void

    public static void main(String[] args) {
        Point p = new Point(1,2);

        p.translate(2, 4);

        System.out.println("x: " + p.getX());
        System.out.println("y: " + p.getY());

        //Point other = new Point(4,6);
        //System.out.println(p.distanceFrom(other));
    }

}