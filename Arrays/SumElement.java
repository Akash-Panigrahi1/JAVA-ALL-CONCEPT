import java.util.Scanner;

public class SumElement {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = readArray();
        int sum = sumArray(array);
        System.out.println("The sum of the array elements is: " + sum);
    }
    public static int[] readArray(){
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int sumArray(int[] array){
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        return sum;
    }
}
