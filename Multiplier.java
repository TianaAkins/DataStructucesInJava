import java.util.*;

public class Multiplier {
    public static int multiply(int x, int y){
        if(y == 1) {
            return x;
        }
        else {
            return (x + multiply(x, y - 1));
        }
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Number 1: ");
    int num1 = sc.nextInt();

    System.out.print("Number 2: ");
    int num2 = sc.nextInt();

    int answer = Multiplier.multiply(num1, num2);
    System.out.println("Product: " + answer);
}
}


