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

// Overloading the main() method
// Java would only run the main class that receives string arrays as arguments
class TestOverLoading4 {
    public static void main(String[] args) {System.out.println("main with String[]");}
    public static void main(String args){System.out.println("main with String");}
    public static void main() {System.out.println("main without args");}
}

// Method OverRIDING

class ABC {
    // Overridden method
    public void disp()
    {
        System.out.println("disp() method of parent class");
    }
}
class Demo extends ABC {
    // Overriding method
    public void disp() {
        System.out.println("disp() method of Child class");
    }
    public void newMethod() {
        System.out.println("new method of child class");
    }
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.disp();
        ABC obj2 = new Demo();
        obj2.disp();
    }
}