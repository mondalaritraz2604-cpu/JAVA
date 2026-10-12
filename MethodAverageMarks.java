
class MethodAverageMarks {
    public void avg(double a, double b) {
        System.out.println("Average = " + (a + b) / 2);
    }

    public void avg(double a, double b, double c) {
        System.out.println("Average = " + (a + b + c) / 3);
    }

    public static void main(String[] args) {
        MethodAverageMarks s = new MethodAverageMarks();
        s.avg(80, 90);
        s.avg(80, 90, 70);
    }
}
