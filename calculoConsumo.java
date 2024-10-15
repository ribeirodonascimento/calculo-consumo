import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        double y = s.nextDouble();
        double consumo = x / y;
        System.out.printf("%.3f km/l%n",consumo);

    }
}