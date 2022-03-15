import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String arg[]) {
        float radius;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input radius for circle: ");
        radius = scan.nextFloat();
        try {
            CircleWithExecption circle = new CircleWithExecption(radius);
            try {
                System.out.println("Area of circle is: " + circle.getArea());
            } catch (Exception e) {
                System.out.println("Area too big!");
            }
        } catch (Exception IllegalArgumentException) {
            System.out.println("radius negative number or zero!");
        }
    }
}
