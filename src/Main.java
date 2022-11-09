import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task1();
    }

        public static void Task1 ()//שאלה 1
    {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        double sum;
        System.out.println("enter a :");
        a=scanner.nextInt();
        System.out.println("enter b :");
        b=scanner.nextInt();
        System.out.println("enter c :");
        c=scanner.nextInt();
        int ac=a*c;
        int d = b*b-4*ac;
        double e = Math.sqrt(b*b-4*ac);
        double x1=(-b+(d))/(2*a);
        double x2=(-b-(d))/(2*a);
        if ( d<0){
            System.out.println(" you have no answer ");
        } else if (d==0) {
            System.out.println("you have one answer. The answer is x1 = " + x1);
        }else {
            System.out.println( "you  have 2 answers " + " x1 is " +x1 + " x2 is " + x2 );
        }

    }

    }
