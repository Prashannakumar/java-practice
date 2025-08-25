import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second number:");
        int num2 = sc.nextInt();

        double sum = (double)(num1 + num2);

        System.out.print("The sum of two numbers is: " + sum);
    }
}
