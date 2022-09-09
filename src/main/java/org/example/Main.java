package org.example;


public class Main {
    public static void main(String[] args) {
        int[] array = {3,4,2,7};
        for (int j = 0; j < array.length - 1; j++)
        {for (int k = j + 1; k < array.length; k++)
        {if (array[j] + array[k] == 10)
        {
            System.out.println("Pair  " + array[j] + "," + array[k] + " and sum consist - 10");
            return;
        }
        }
            System.out.println("Pair not found. Please try again");
        }

    }

}