package se.lexion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {

                char operator;
            Double num1, num2, result;


            Scanner input = new Scanner(System.in);
                        System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);


            System.out.println("First number");
            num1 = input.nextDouble();

            System.out.println("Second number");
            num2 = input.nextDouble();

            switch (operator) {

                case '+':
                    result = num1 + num2;
                    System.out.println(result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println(result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println(result);
                    break;


                case '/':
                    result = num1 / num2;
                    System.out.println(result);
                    break;

                default:
                    System.out.println("operator does not exixt-**");
                    break;
            }

            input.close();
        }
    }
