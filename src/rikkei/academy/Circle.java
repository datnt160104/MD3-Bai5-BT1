package rikkei.academy;

public class Circle {
    private double radius;
    private  String color;


    public Circle(){
        this.radius=1.0;
        this.color="red";
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }


//    protected double getRadius(){
//        return this.radius;
//  }
//    protected  double getArea(){
//        return  this.radius*this.radius*Math.PI;
//  }

//    private double getRadius(){
//        return this.radius;
//  }
//    private  double getArea(){
//        return  this.radius*this.radius*Math.PI;
//  }



//     double getRadius(){
//        return this.radius;
//    }
//    double getArea(){
//        return  this.radius*this.radius*Math.PI;
//    }
}
