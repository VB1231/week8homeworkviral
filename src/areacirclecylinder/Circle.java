package areacirclecylinder;

public class Circle {
    double radius;
  Circle(double radius)
    {if(radius<0)
        this.radius=0;
        else
        this.radius=radius;
    }
    double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return (Math.PI*this.radius*this.radius);
    }

}
