import java.util.Scanner;

public class Factorial {
    private static long workFac = 1;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Adj meg egy számot: ");
        int input = scn.nextInt();
        long fak = facFor(input);
        System.out.println("A szám faktoriálisa ciklussal: " + fak);
        fak = facRec(input);
        System.out.println("A szám faktoriálisa rekurzívan: " + fak);
    }

    private static long facFor(long number){
        long fac = number;
        for(long i = number-1; i > 0;i--){
            fac *= i;
        }
        return fac;
    }

    private static long facRec(long number){
        if(number > 0) {
            workFac *= number;
            facRec(number-1);
        }
        return workFac;
    }
}