package areacirclecylinder;
public class Cylinder extends Circle{
    double height;
    Cylinder(double radius,double height) {

       super(5.55);
        if(height< 0){
            this.height = 0.0;
        } else{
            this.height = height;
        }
       }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        double volume = getArea()*this.height;
        return volume;
    }

}
