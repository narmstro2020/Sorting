package org.WalkerCC_CompSci;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Prep work Start
        int[] numbers = new int[100000];
        Random rd = new Random();

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rd.nextInt(1000);
        }

        //printArray(numbers);
        //prep work end

        double startTime = System.currentTimeMillis();
        BubbleSort(numbers);
        double endTime = System.currentTimeMillis();
        double deltaTime = (endTime - startTime)/1000;
        //printArray(numbers);

        System.out.println("It took " + deltaTime + " seconds to sort " + numbers.length + " items.");

    }

    private static void BubbleSort(int[] numbers) {

        int lastItemToCheck = numbers.length - 2;

        for(int i = 0; i < numbers.length - 2; i++){

            for(int j = 0; j < lastItemToCheck; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
            lastItemToCheck--;
        }




    }

    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println();
    }
}
