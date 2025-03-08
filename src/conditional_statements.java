// https://sites.google.com/revature.com/studyguide/java/conditional-statements?authuser=0

//public class conditional_statements {}

/*
    if(Boolean_expression) {
    // Statements will execute if the Boolean expression is true
    }
*/
import java.util.Scanner;
import javax.swing.JOptionPane;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = sc.nextInt();
        String y = JOptionPane.showInputDialog("Enter a number");
        //        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }
        int yParshed = Integer.parseInt(y);
        if (yParshed > 5) {
            System.out.println("yParshed is greater than 5");
        } else {
            System.out.println("yParshed is less than or equal to 5");
        }
    }
}