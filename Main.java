package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* int startNum = 1;
        while(startNum<101){
            if (startNum %2 ==0){
                System.out.println(startNum);
                startNum=startNum+1;}
            else{
                startNum=startNum+1;}*/
        Scanner scanner = new Scanner(System.in);
        // int countNum = 0;
        //  int inputNunm = 0;
       /* do{
            System.out.println("input number: ");
            inputNunm = scanner.nextInt();
            countNum = countNum+inputNunm;
            }while(inputNunm>=0);
        System.out.println(String.format("the total sum is %d", countNum));*
      /*  do{
            System.out.println("input number: ");
            inputNunm = scanner.nextInt();
        }while(inputNunm<101);*/
       /* int newNum = 4;
        do {
            if (newNum % 2 == 0) {
                System.out.print(newNum + ",");
                newNum = newNum + 1;
            }else{
                newNum = newNum + 1;
            }

        }while (newNum < 100);
        System.out.print(newNum);*/
        int num1;
        int num2;
        do{
            System.out.println("input number 1: ");
            num1=scanner.nextInt();
            System.out.println("input number 2: ");
            num2=scanner.nextInt();
        }while(num1!=num2);
        System.out.println(String.format("THE NUMBERS ARE THE SAME = %d",num1));
    }
}



