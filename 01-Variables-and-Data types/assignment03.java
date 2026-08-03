import java.util.*;

public class assignment03 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float penncil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float totalCost = penncil + pen + eraser;

        System.out.println("Bill amount is: " + totalCost);

        //Add on - with 18% tax

        float newTotalCost = totalCost + (0.18f * totalCost);

        System.out.println("Bill amount with 18% tax is: " + newTotalCost);
    }
    
}
