public class Point {
    int x, y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        x = this.x;
        return x;
    }

    public int getY() {
        y = this.y;
        return y;
    }

    public void setX(int x) {
        this.x = x;

    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((0 - this.getX()) * (0 - this.getX()) + (0 -
                this.getY()) * (0 - this.getY()));
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.getX()) * (x - this.getX()) + (y -
                this.getY()) * (y - this.getY()));
    }

    public double distance(Point second) {
        return Math.sqrt((second.getX() -
                this.getX()) * (second.getX() - this.getX()) + (second.getY() -
                this.getY()) * (second.getY() - this.getY()));
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point s = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(s));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}
