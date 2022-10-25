package floorarea;
public class Floor {
    double width, length;
    public Floor(double width, double length) {

        if (width < 0 && length < 0) {
            this.width = width = 0;
            this.length = length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }

    public double getArea() {
        return (this.length * this.width);
    }

}
