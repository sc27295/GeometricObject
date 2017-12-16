 class Circle extends GeometricObject
 {
    public double radius;

    public Circle(double radius)
    {
        this.radius=radius;
    }
    //returns circle parameter

    public double getPerimeter()
    {
        return  Math.PI*radius*radius;
    }
    public  double getArea()
    {
        return 2*Math.PI*radius;
    }
    }
