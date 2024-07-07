package day15;

import vn.edu.likelion.assignment3.Teacher;

import java.util.Optional;

public class Excercise {
    public static void main(String[] args){
        int     vendor_x       = 5,
                y       =10,
                z       = 20,
                hello   = 100;
        ExampleOfLambda exampleOfLambda = () -> System.out.println(x+y);
        exampleOfLambda.print();
    }
}
@FunctionalInterface
interface ExampleOfLambda{
    void print();
}