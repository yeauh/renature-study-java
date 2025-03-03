public class Adder {
    static int add(int a, int b) {return a + b;}
    static int add(int a, int b, int c) {return a + b + c;}
}
class testOverLoading1 {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 1));
        System.out.println(Adder.add(1, 2, 4));
    }
}

// Method Overloading - Changing data type of arguments
class Adder2 {
    static int add(int a, int b) {return a + b;}
    static double add(double a, double b) {return a + b;} // 2 arguments of double data type
}
class testOverLoading2 {
    public static void main(String[] args) {
        System.out.println(Adder2.add(11, 11));
        System.out.println(Adder2.add(2.2, 2.2));
    }
}