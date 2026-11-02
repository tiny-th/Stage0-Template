public class Point {
    private final double x;
    private final double y;
    public static final Point ORIGIN = new Point(0, 0);

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }
}
