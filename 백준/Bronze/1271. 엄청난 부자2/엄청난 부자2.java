import java.util.Scanner;
import java.math.BigInteger;
//BigInteger에 대해서 알고 풀었어야하는 문제, BigInteger의 범위는 문자열이여서 무한임
//BinInteger의 값을 계산하려면 add(+),subtract(-),multiply(*),divide(/) 써야함

public class Main{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        in.close();

        System.out.println(a.divide(b));
        System.out.println(a.remainder(b));
        //remainder = 나머지
    }
}