package ru.ibs.program14;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();
        for (int i=0; i<array.length; i++) {
            int randomNumber = random.nextInt(41) - 20;
            array[i] = randomNumber;
            System.out.println("array[" + i + "]="+randomNumber);
        }

        //1.
        int max = array[0];
        int min = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println("MAX="+max);
        System.out.println("MIN="+min);

        //2.
        int abs1 = Math.abs(max);
        int abs2 = Math.abs(min);
        if (abs1  > abs2) {
            System.out.println("Наибольшее число по модулю = "+abs1);
        }
        else if (abs1 < abs2) {
            System.out.println("Наибольшее число по модулю = "+abs2);
        }
    }
}
