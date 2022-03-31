import java.util.Scanner;
public class Mystery
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("racecar"))
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        int start = input.nextInt();
        System.out.println(countdown(start));
    }

    public static String countdown(int number)
    {
        // WRITE THIS RECURSIVE METHOD!
        if(number <= 1) {
            return "Blastoff!";
        }
        else {
            return number + " "+ countdown(number - 1);
        }
    }

    public static boolean isPalindrome(String check) {
    if()
    }


}
