import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.*;
interface Formulas
{
    void Area();
    void Circumference();
    void Diameter();
    void Volume();
    void Perimeter();
}
class Circle implements Formulas
{
    double redius=0;
    Circle(double redius)
    {
        this.redius=redius;
    }
    public void Area()
    {
        double area=Math.PI * Math.pow(redius,2);
        out.println("Area of Circle for given redius is : "+area);
    }
    public void Circumference()
    {
        double circumference=2 * Math.PI * redius;
        out.println("Circumference of Circle for given redius is : "+circumference);
    }
    public void Diameter()
    {
        double daimeter=2 * redius;
        out.println("Diameter of Circle for given redius is : "+daimeter);
    }
    public void Perimeter() {

    }
    public void Volume() {

    }
}

class Square implements Formulas
{
    double length=0;
    Square(double length)
    {
        this.length=length;
    }
    public void Area()
    {
        double area=Math.pow(length,2);
        out.println("Area of Square for given length is : "+area);
    }
    public void Circumference()
    {
        double circumference=4 * length;
        out.println("Circumference of Square for given length is : "+circumference);
    }
    public void Diameter()
    {
        double daimeter=length* Math.sqrt(2);
        out.println("Diameter of Square for given length is : "+daimeter);
    }
    public void Perimeter() {
        double perimeter=4 * length;
        out.println("Perimeter of Square for given length is : "+perimeter);
    }
    public void Volume() {
        double volume= Math.pow(length,3);
        out.println("Volume of Square for given length is : "+ volume);
    }
}

class Sphere implements Formulas
{
    double redius=0;
    Sphere(double redius)
    {
        this.redius=redius;
    }
    public void Area()
    {
        double area=4* Math.PI * Math.pow(redius,2);
        out.println("Area of Sphere for given redius is : "+area);
    }
    public void Circumference()
    {
        double circumference=2 * Math.PI * redius;
        out.println("Circumference of Sphere for given redius is : "+circumference);
    }
    public void Diameter()
    {
        double daimeter=2 * redius;
        out.println("Diameter of Sphere for given redius is : "+daimeter);
    }
    public void Volume() {
        double volume=(4/3)* Math.PI * Math.pow(redius,3);
        out.println("Volume of Sphere for given Value : "+volume);
    }
    public void Perimeter() {

    }
}

class Cylinder implements Formulas
{
    double redius=0;
    double height=0;
    Cylinder(double redius, double height)
    {
        this.redius=redius;
        this.height=height;
    }
    public void Area()
    {
        double area=(2*Math.PI*redius*height)+(2*Math.PI* Math.pow(redius,2));
        out.println("Area of Cylinder for given redius is : "+area);
    }
    public void Circumference()
    {
        double circumference=2 * Math.PI * redius;
        out.println("Circumference of Cylinder for given redius is : "+circumference);
    }
    public void Diameter()
    {
        double volume1=Math.PI* Math.pow(redius,2)*height;
        double daimeter=2 * Math.sqrt(volume1/(Math.PI*height));
        out.println("Diameter of Cylinder for given redius is : "+daimeter);
    }
    public void Volume() {
        double volume=Math.PI* Math.pow(redius,2)*height;
        out.println("Volume of Cylinder for given Value : "+volume);
    }
    public void Perimeter() {

    }
}

class Rectangle implements Formulas
{
    double width=0;
    double length=0;
    double height=0;
    Rectangle(double width, double length, double height)
    {
        this.width=width;
        this.length=length;
        this.height=height;
    }
    public void Area()
    {
        double area=width * length;
        out.println("Area of Rectangle for given Value is : "+area);
    }
    public void Circumference()
    {
        double circumference=2 * width+length;
        out.println("Circumference of Rectangle for given redius is : "+circumference);
    }
    public void Diameter()
    {
        double daimeter=Math.pow(width,2)+Math.pow(length,2);
        double diameter=Math.pow(daimeter,2);
        out.println("Diameter of Rectangle for given redius is : "+ diameter);
    }
    public void Volume() {
        double volume=length*width*height;
        out.println("Volume of Rectangle for given Value : "+volume);
    }
    public void Perimeter() {
        double perimeter=2 * width+length;
        out.println("Perimeter of Rectangle for given Value is : "+perimeter);
    }
}

class Triangle implements Formulas
{
    double width=0;
    double height=0;
    Triangle(double width, double height)
    {
        this.width=width;
        this.height=height;
    }
    public void Area()
    {
        double area=(height*width)/2;
        out.println("Area of Triangle for given Value is : "+area);
    }
    public void Circumference()
    {
    }
    public void Diameter()
    {
    }
    public void Volume() {

    }
    public void Perimeter() {
        Scanner sc=new Scanner(System.in);
        out.println("Enter First Side length : ");
        double firstSide=sc.nextDouble();
        out.println("Enter Second Side length : ");
        double secondSide=sc.nextDouble();
        out.println("Enter Base length : ");
        double baselength=sc.nextDouble();

        out.println("Perimeter of Triangle is : "+ firstSide+secondSide+baselength);
    }
}

public class ShapsAssignment
{
    public static void main(String[] args)
    {
        while (true) {
            double redius;
            double height;
            double length;
            double width;

            out.println("Please Enter Your Choice ");
            Scanner sc = new Scanner(in);
            out.println("1. Circle ");
            out.println("2. Triangle ");
            out.println("3. Rectangle ");
            out.println("4. Square ");
            out.println("5. Sphere ");
            out.println("6. Cylinder ");
            out.println("7. Exit ");

            String shape = sc.next();
            try {
                switch (shape) {
                    case "Circle":
                        out.println("Enter Redius of Circle : ");
                        redius = sc.nextDouble();
                        Circle circle = new Circle(redius);
                        circle.Area();
                        circle.Circumference();
                        circle.Diameter();
                        break;

                    case "Triangle":
                        out.println("Enter Width of Triangle : ");
                        width = sc.nextDouble();
                        out.println("Enter Height of Triangle : ");
                        height = sc.nextDouble();
                        Triangle triangle = new Triangle(width, height);
                        triangle.Area();
                        triangle.Perimeter();
                        break;

                    case "Rectangle":
                        out.println("Enter Width of Rectangle : ");
                        width = sc.nextDouble();
                        out.println("Enter length of Rectangle : ");
                        length = sc.nextDouble();
                        out.println("Enter Height of Rectangle : ");
                        height = sc.nextDouble();
                        Rectangle rectangle = new Rectangle(width, length, height);
                        rectangle.Area();
                        rectangle.Circumference();
                        rectangle.Diameter();
                        rectangle.Perimeter();
                        rectangle.Volume();
                        break;

                    case "Square":
                        out.println("Enter Side-length For Square : ");
                        length = sc.nextDouble();
                        Square square = new Square(length);
                        square.Area();
                        square.Circumference();
                        square.Diameter();
                        square.Perimeter();
                        square.Volume();
                        break;

                    case "Sphere":
                        out.println("Enter Redius of Sphere : ");
                        redius = sc.nextDouble();
                        Sphere sphere = new Sphere(redius);
                        sphere.Area();
                        sphere.Circumference();
                        sphere.Diameter();
                        sphere.Volume();
                        break;

                    case "Cylinder":
                        out.println("Enter Redius : ");
                        redius = sc.nextDouble();
                        out.println("Enter Height : ");
                        height = sc.nextDouble();
                        Cylinder cylinder = new Cylinder(redius, height);
                        cylinder.Area();
                        cylinder.Circumference();
                        cylinder.Diameter();
                        cylinder.Volume();

                        break;
                    case "Exit":
                        exit(0);
                        break;

                    default:
                        out.println("Shape Not Exists: ");
                }
            }
            catch (InputMismatchException e)
            {
                e.printStackTrace();
            }
        }
    }
}