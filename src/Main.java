import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        // A = P [1+r/n]^nt

        Scanner scanner = new Scanner(System.in) ;

        double principal;
        double rate;
        double compounded;
        int years;
        double total ;

        System.out.print("Enter the ammount you have in bank :");
        principal= scanner.nextFloat() ;

        System.out.print("Enter Interest rate (in % ) :");
        rate = scanner.nextFloat();

        System.out.print("Enter the # of times compounded per year :");
        compounded = scanner.nextFloat();

        System.out.print("Enter the ammount of years :");
        years = scanner.nextInt();        ;

        rate /= 100;
        total = principal * Math.pow(1+rate/compounded, compounded*years) ;


        System.out.printf("The total ammound after compounded interest added is : %.2f", total);


        scanner.close();
    }

        }