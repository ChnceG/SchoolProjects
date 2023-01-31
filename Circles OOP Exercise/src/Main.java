import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Circle one = new Circle();
        System.out.println(one.getArea(one));
        System.out.println(one);

        int rad;
        String colour;

        System.out.println("What size is your circle?");
        rad = kb.nextInt();
        Circle two = new Circle(rad);

        System.out.println(two.getArea(two));
        System.out.println(two);

        System.out.println("What size is your circle?");
        rad = kb.nextInt();
        kb.nextLine();
        System.out.println("What colour is your circle?");
        colour = kb.nextLine();
        Circle three = new Circle(rad, colour);

        System.out.println(three.getArea(three));
        System.out.println(three);
    }
}