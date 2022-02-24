package studentWork.jackson_lafferty;

public class Sample {

    public static void main(String[] args) {
        Point p = new Point(1,2);
        p.setX(1);

        System.out.println("x: " + p.getX());
        System.out.println("y: " + p.getY());

        Point other = new Point(4,6);
        System.out.println(p.distanceFrom(other));
    }
    
}
