import java.util.*;

public class inputInJava {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    String input = sc.next();
    System.out.println(input);

    String name = sc.nextLine();
    System.out.println(name);

    int number = sc.nextInt();
    System.out.println(number);

    float price = sc.nextFloat();
    System.out.println(price);

    double amount = sc.nextDouble();
    System.out.println(amount);

    boolean var = sc.nextBoolean();
    System.out.println(var);

    short n = sc.nextShort();
    System.out.println(n);

    long l = sc.nextLong();
    System.out.println(l);
    }
    
}
