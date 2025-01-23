import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int smallest = array[0];
        int largest = array[0];

        for (int num : array) {
            sum += num;
            if (num < smallest)
                smallest = num;
            if (num > largest)
                largest = num;
        }
        double average = (double) sum / n;

        Arrays.sort(array);
        int secondSmallest = array[1];
        int secondLargest = array[n - 2];

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);
    }
}


















