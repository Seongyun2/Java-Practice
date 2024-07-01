import java.util.Scanner;
import java.math.BigInteger;

 public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        BigInteger n = in.nextBigInteger();
        BigInteger m = in.nextBigInteger();

        BigInteger result = n.subtract(m).abs();

        System.out.println(result);
    }
}