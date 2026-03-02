import java.util.Random;

public class Task8 {
    public static void main(String[] args) {

        Random rnd = new Random();
        int die1 = 0;
        int die2 = 1;
        int die3 = 2;
        int dieSum;
        int rollNum = 0;

        System.out.println("Roll:      Die1 Die2 Die3 Sum");
        System.out.println("-----------------------------");
        while(!(die1 == die2 && die2 == die3))
        {
            rollNum ++;
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            die3 = rnd.nextInt(6) + 1;
            dieSum = die1 + die2 + die3;

            System.out.printf("Roll: %-5d %3d %3d %3d %4d\n", rollNum, die1, die2, die3, dieSum);
        }
        System.out.println("-----------------------------");
    }
}
