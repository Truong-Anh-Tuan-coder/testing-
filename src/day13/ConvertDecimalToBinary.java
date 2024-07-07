package day13;

import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int input;
        int     a = 0,
                b = 0,
                c = 0,
                d = 10;
        int     ax = a != b ? 0 :
                     a != c ? 0 :
                     a != d ? 1 : 0 ;



        System.out.println(ax);

        System.out.print("input number to convert: ");
        input = scanner.nextInt();
        scanner.nextLine();
        ConvertDecimalToString conveter = () -> converter.convertDecimalToBinary(input);
    }
}
@FunctionalInterface
interface  ConvertDecimalToString {
    public void Convert();
}
class converter{
    static void convertDecimalToBinary(int input){
        int remainder, quotient = input;
        String binaryNum = "";
        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum
                    = Integer.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }
        System.out.println("decimal of " + input + " is: " + binaryNum);

    }
}