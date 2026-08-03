import java.util.*;
public class areaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float radius = sc.nextFloat();
        float PI = 3.14f;
        float area = PI * radius * radius;
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
    }
    
}
