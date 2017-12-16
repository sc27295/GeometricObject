import java.util.Date;

abstract class GeometricObject
{ private String color="white";
    private boolean filled;
    private java.util.Date dateCreated;

    // construct a default geometric object
    public GeometricObject()
    {
        dateCreated=new java.util.Date();
    }
//Construct a default geometric object
    public GeometricObject(String color, boolean filled)
    {
        dateCreated=new java.util.Date();
        this.color=color;
        this.filled=filled;
    }
    //Returns color

    public String getColor() {
        return color;

    }
    public void setColor(String color){

        this.color=color;
    }

    public boolean isFilled(){

        return filled;
    }
    //set a new filled value
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    //returns creation date
    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }
    //returns string reprentation of object
    public String toString()
    {
        return "created on" +dateCreated+"color: "+color+"filled: " +filled;
    }
    public  abstract double getArea();
    public abstract double getPerimeter();
}
