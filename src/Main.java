
class Main{
    public static void main(String[] args) {
        Rectangular rectangle1 = new Rectangular(9,12);
        Rectangular rectangle2 = new Rectangular(6,12);

        System.out.println(rectangle1.calculateArea() );
        System.out.println(rectangle1.calculatePerimeter());;
        System.out.println(rectangle2.calculateArea());
        System.out.println(rectangle2.calculatePerimeter());
    }
}

class Rectangular{
    double length;
    double breadth;


    public Rectangular(double length,double breadth)
    {
        this.length = length;
        this.breadth =breadth;
    }

    double calculateArea(){
        System.out.println("Area of the rectangle");
        return length*breadth;
    }

    double calculatePerimeter(){
        System.out.println("Perimeter  of the rectangle");
        return 2 *(length+breadth);
    }
}