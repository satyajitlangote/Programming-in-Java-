import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int low = 0;
        int high;
        int mid;
        int flag = 0;
        int a[] = new int[5];
        
        // Input values into the array
        System.out.println("Enter 5 values for the array:");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        
        
        System.out.println("Array elements:");
        for (i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        
        System.out.println("Enter value to search:");
        int se = sc.nextInt();

        high = 4;        
        // Binary search logic
        while (low <= high) {
            mid = (low + high) / 2;
            
            if (a[mid] == se) {
                flag = 1;
                break;
            } else if (se < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        
        if (flag == 1) {
            System.out.println("Element found at index: " );
        } else {
            System.out.println("Element not found");
        }
        
        sc.close();
    }
}
