import java.util.Scanner;

public class looping_constructs { }

/*
* Types of Loops:
* While loop
* For Loop
* Do...While Loops*/

// While loop

class Test1 {
    public static void main(String[] args) {
        int x = 10;
        while (x <= 20) {
            System.out.print("Value of x: " + x);
            x++;
            System.out.println();
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        System.out.println("For loop\n");
        for (int x = 10; x < 20; x++) {
            System.out.print("Value of x: " + x);
            System.out.println();
        }
    }
}
