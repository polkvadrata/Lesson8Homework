package app;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        //----- №1
        int[] array = new int[15];
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        //----- №2
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(99) + 1;
        }

        //----- №3
        System.out.println(Arrays.toString(array));

        //----- №4
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        //----- №5
        System.out.println(Arrays.toString(array));

        //----- №6
        System.out.println("Введіть число для пошуку:");
        int manualNumber = scanner.nextInt();

        //----- №7
        int left = 0;
        int right = array.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == manualNumber) {
                index = mid;
                break;
            } else if (array[mid] < manualNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if(index >= 0){
            System.out.printf(" Індекс числа %d у відсортованому масиві: %d",manualNumber,index);
        } else System.out.println("Заданного числа немає у массиві");

        scanner.close();
    }

}
