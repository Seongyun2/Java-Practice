import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        double result = a / b;

        sc.close();
        //resource를 불러와서 하는것 코드 꼬일수있어 닫아주는것이 좋음

        System.out.println(result);
    }
}