import java.util.Arrays;

public class CycleFor {
    public static void main(String args[]) {
        //Create array random number
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
//Sort array
        Arrays.sort(arr);
//Output sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}