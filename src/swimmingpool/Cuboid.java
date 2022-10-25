package swimmingpool;

public class Cuboid extends Rectangle{
    double height;
    public Cuboid(double width,double height,double length){
      super(5,10);
        if(height<0)
            this.height=0;
        else
            this.height=height;
  }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        double volume = super.getArea() * this.height;
        return volume;
    }
}
