/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task5zahharsimanski;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Zaharu-sos
 */
public class Sptv22task5zahharsimanski {
 public static void main(String[] args) {
        int[][] Array = new int[5][];

        Array[0] = new int[3];
        Array[1] = new int[5];
        Array[2] = new int[7];
        Array[3] = new int[8];
        Array[4] = new int[9];

        Random random = new Random();
        int totalElements = 0;

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = random.nextInt(51) + 50;
                totalElements++;
            }
        }

        System.out.println("no sort:");
        printArray(Array);

        int[] flatArray = new int[totalElements];
        int index = 0;

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                flatArray[index++] = Array[i][j];
            }
        }

        Arrays.sort(flatArray);

        index = 0;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = flatArray[index++];
            }
        }

        System.out.println("\nsort:");
        printArray(Array);
    }
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}