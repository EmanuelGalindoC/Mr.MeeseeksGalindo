import java.util.Scanner;
import static java.util.Objects.equals;
public class Task3 {
int number,hiddernumber;
int win;
    public static void main (String [] args)

    {

        Scanner scaner = new Scanner(System.in);

        scaner.useDelimiter("\\n");

        int count=0; int hiddernumber; while (count<2)

    {

        hiddernumber = (int) ((Math.random() * 100) + 1); System.out.println("*******************************************************");

        System.out.println("********Guess the number random between 1 - 100********");

        System.out.println("*******************************************************");

        System.out.println("Number hidden is " + hiddernumber); int win=0;

        while (win < 1) {

            System.out.println("***************************************");

            System.out.println("Enter a Number");

            int number = scaner.nextInt();
            CompareNumber compareNumber = new CompareNumber();
            compareNumber.CompareNumbers(number,hiddernumber);

        }count++;

    }

    }

}

//add feature "number of attempts"

//keep the play 3 times feature

