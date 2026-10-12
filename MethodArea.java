class MethodArea {
    public void area(int side) {
        System.out.println("Area of square = " + (side * side));
    }

    public void area(int length, int breadth) {
        System.out.println("Area of rectangle = " + (length * breadth));
    }

    public void area(double radius) {
        System.out.println("Area of circle = " + (Math.PI * radius * radius));
    }

    public static void main(String[] args) {
        MethodArea a = new MethodArea();
        a.area(5);
        a.area(10, 6);
        a.area(3.0);
    }
}
