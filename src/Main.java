import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int randomnumber = (int)(Math.random()*100); // Math class random function generates a random number between 0.0 and 1
        Scanner sc = new Scanner(System.in);
        int count = 5;
        int usernumber;
        do{
            System.out.println("Guess the number between 0 and 100 in five tries".formatted(count));
            usernumber = sc.nextInt();
            if (usernumber==randomnumber) {
                System.out.println("You have guessed the number correctly.");
                break;
            }
            else if (usernumber>randomnumber) {
                System.out.println("Wrong! Try a shorter number");
                count--;
            }
            else if(usernumber<randomnumber){
                System.out.println("Wrong! Try a greater number");
                count--;
            }
            else
                System.out.println("Thanks for playing");
        }while(usernumber>=0 && count>=1);
    }
}