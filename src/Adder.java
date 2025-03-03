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
