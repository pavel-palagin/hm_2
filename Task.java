import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {



    public static void main(String[] args) {


        //Задача 1

       enterNumber();

        //Задача 4

//        spaceStr();




        //Задача 2

//       int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
//        try {
//            int d = 0;
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }


        //Задача 3
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//
//        try {
//            abc[3] = 9;
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//    public static void printSum(Integer a, Integer b) {
//        System.out.println(a + b);
//    }
//





}


    //Задача 1

/*
     Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     вместо этого, необходимо повторно запросить у пользователя ввод данных.
    */



    public static void enterNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input float number: ");
        float num = in.nextFloat();

        try{


        }catch (InputMismatchException e){
            System.out.println("Invalid value");
        }finally {
            System.out.printf("Your number: %s \n", num);
        }

    }



    //Задача 4

    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

//    public static void spaceStr(){
//        Scanner in = new Scanner(System.in);
//
//
//            System.out.println("Input: ");
//            String str = in.nextLine();
//
//            try {
//                if(str == "" || str == " "){
//                    throw new RuntimeException();
//                }
//            }catch (Exception e){
//                System.out.println("Cant input empty line");
//            }
//
//
//
//    }




}












