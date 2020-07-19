package hometask10;

import java.util.Arrays;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(Arrays.stream(arr).average().getAsDouble());
    }
}