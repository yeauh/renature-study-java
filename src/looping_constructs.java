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

class Test3 {
    public static void main(String[] args) {
        System.out.print("Do..While loop\n");
        int x = 10;

        do {
            System.out.print("Value of x: " + x);
            x++;
            System.out.println();
        } while (x < 20);
    }
}

class Test4 {
    public static void main(String[] args) {
        System.out.print("Enhanced For Loop\n");
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println();
    }
}