public class ArrayWithShifting {
    public static void main(String[] args){
        
        ArrayWithShifting obj = new ArrayWithShifting();
        int[] arr = new int[4];
        arr[0] = 20;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 50;

        for (int index = 0; index < 4; index++) {
            System.out.println("Element at index ---> " + arr[index]);
        }

        obj.insertWithShifting(arr, 9, 1);

        for (int index = 0; index < 4; index++) {
            System.out.println("Element With Shifting at index ---> " + index + " is " + arr[index]);
        }
    }
    public void insertWithShifting(int arr[], int element, int index) {
        int len = arr.length;
        if (index < 0 || index >= len) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = len - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
    }
}